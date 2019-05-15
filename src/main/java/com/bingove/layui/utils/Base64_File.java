package com.bingove.layui.utils;

import sun.misc.BASE64Decoder;

import java.io.*;
import java.util.Base64;

/**
 * @projectName KTEcg
 * @Author 常冬军
 * @Date 2019/4/17 0017下午 15:25
 * @title: Base64_File
 * @ToDo
 */
public class Base64_File {
    /**
     * @param path
     * @return String
     * @description 将文件转base64字符串
     * @date 2018年3月20日
     * @author changyl
     * File转成编码成BASE64
     */

    public static String fileToBase64(String path) {
        String base64 = null;
        InputStream in = null;
        try {
            File file = new File(path);
            in = new FileInputStream(file);
            byte[] bytes = new byte[(int) file.length()];
            in.read(bytes);
            base64 = Base64.getEncoder().encodeToString(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return base64;
    }

    //BASE64解码成File文件
    public static void base64ToFile(String destPath, String base64, String fileName) {
        File file = null;
        //创建文件目录
        String filePath = destPath;
        File dir = new File(filePath);
        if (!dir.exists() && !dir.isDirectory()) {
            dir.mkdirs();
        }
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        try {
            byte[] bytes = Base64.getDecoder().decode(base64);
            file = new File(filePath + "/" + fileName);
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            bos.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /**
     *      * 将base64字符解码保存文件
     *      *
     *      * @param base64Code
     *      * @param targetPath
     *      * @throws Exception
     *      
     */

    public static void decoderBase64File(String base64Code, String targetPath, String catalogue)
            throws Exception {
        File file = new File(catalogue);
        if (file.exists() == false) {
            file.mkdirs();
        }
        byte[] buffer = new BASE64Decoder().decodeBuffer(base64Code);
/*        byte b0 = buffer[5];
        byte b1 = buffer[6];
        byte b2 = buffer[7];
        byte b3 = buffer[8];
        int anInt = Main_T.getInt(b0, b1, b2, b3);
        System.out.println("acInt --  " + anInt);*/
        String s = "";
        /*for (int i = 0; i <=3 ; i++) {
            s+=buffer[i];
            System.out.println(s + "                " );
        }
        System.out.println( " buffer.length    " + buffer.length);*/
        FileOutputStream out = new FileOutputStream(targetPath);
        out.write(buffer);
        out.close();
    }
}
