package com.bingove.layui.utils;

/**
 * @projectName KTEcg
 * @Author 常冬军
 * @Date 2019/4/17 0017下午 18:24
 * @title: B
 * @ToDo
 */

import java.io.IOException;
import java.io.RandomAccessFile;

public class B {
    public static void main(String[] args) {
        FileBlock fileBlock = new FileBlock();
        //fileBlock.
        System.out.println("s");
    }
    public static class FileBlock {
        short type;
        short id;
        int offset;
        int length;

        public short getType() {
            return type;
        }

        public short getId() {
            return id;
        }

        public int getOffset() {
            return offset;
        }

        public int getLength() {
            return length;
        }
    }

    private int numberOfBlocks;
    private FileBlock[] fileBlocks;
    private RandomAccessFile file;

    public B(String fileName) throws IOException {
        file = new RandomAccessFile(fileName, "r");
        readHeader();//预读文件的数据分配表
    }

    private void readHeader() throws IOException {
        byte[] buffer = new byte[12];
        if (2 != file.read(buffer, 0, 2)) {
            throw new IllegalStateException("读取数据出错");
        }
        numberOfBlocks = (buffer[0] & 0xFF) << 8 | (buffer[1] & 0xFF);
        if (numberOfBlocks < 0 || file.length() < (numberOfBlocks * 12 + 2)) {
            throw new IllegalStateException("读取文件头数据出错");
        }
        fileBlocks = new FileBlock[numberOfBlocks];
        for (int i = 0; i < fileBlocks.length; i++) {
            FileBlock ff = new FileBlock();
            if (2 != file.read(buffer, 0, 2)) {
                throw new IllegalStateException("读取数据出错");
            }
            ff.type = (short) ((buffer[0] & 0xFF) << 8 | (buffer[1] & 0xFF));
            if (2 != file.read(buffer, 0, 2)) {
                throw new IllegalStateException("读取数据出错");
            }
            ff.id = (short) ((buffer[0] & 0xFF) << 8 | (buffer[1] & 0xFF));
            if (4 != file.read(buffer, 0, 4)) {
                throw new IllegalStateException("读取数据出错");
            }
            ff.offset = (buffer[0] & 0xFF) << 24 | (buffer[1] & 0xFF) << 16 | (buffer[2] & 0xFF) << 8 | (buffer[3] & 0xFF);
            if (4 != file.read(buffer, 0, 4)) {
                throw new IllegalStateException("读取数据出错");
            }
            ff.length = (buffer[0] & 0xFF) << 24 | (buffer[1] & 0xFF) << 16 | (buffer[2] & 0xFF) << 8 | (buffer[3] & 0xFF);
            fileBlocks[i] = ff;
        }
    }

    /**
     * 返回小数据量时可以使用，大数据量时需要另行编写代码。
     */
    public byte[] getData(FileBlock block) throws IOException {
        FileBlock fBlock = null;
        for (FileBlock fb : fileBlocks) {
            if (fb == block) {
                fBlock = fb;
                break;
            }
        }
        if (fBlock == null) {
            throw new IllegalArgumentException("错误的参数");
        }
        byte[] data = new byte[block.length];
        file.seek(block.offset);
        if (file.read(data) != block.length) {
            throw new IllegalStateException("读取数据出错");
        }
        return data;
    }

    /**
     * 返回小数据量时可以使用，大数据量时需要另行编写代码。
     */
    public byte[] getData(int blockIndex) throws IOException {
        return getData(getField(blockIndex));
    }

    public FileBlock getField(int blockIndex) {
        if (blockIndex < 0 || blockIndex >= numberOfBlocks) {
            throw new IllegalArgumentException("错误的参数");
        }
        return fileBlocks[blockIndex];
    }

    public int getNumberOfBlocks() {
        return numberOfBlocks;
    }

}

