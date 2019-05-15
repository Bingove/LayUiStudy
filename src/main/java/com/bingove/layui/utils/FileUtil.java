package com.bingove.layui.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by LEE on 2016-11-10.
 */
public class FileUtil {

    private static void saveAsFileWriter(String content, String savefile) {

        FileWriter fwriter = null;
        try {
            fwriter = new FileWriter(savefile);
            fwriter.write(content);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fwriter.flush();
                fwriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * 文件上传
     *
     * @param in
     * @param dir
     * @param fileName
     * @return
     * @throws IOException
     */
    public static File saveFile(InputStream in, String dir, String fileName) throws IOException {
        File directory = new File(dir);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        File file = new File(dir, fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(file);//写到b.txt中去
        /*  BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        BufferedWriter write = new BufferedWriter(new OutputStreamWriter(fos));
        String temp;
        while((temp = reader.readLine())!= null){//一次读一行
            write.write(temp);
        }
        reader.close();
        write.close();*/
        BufferedInputStream bis = new BufferedInputStream(in);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int i;
        while ((i = bis.read()) != -1) {
            bos.write(i);
            bos.flush();
        }
        bis.close();
        bos.close();
        fos.close();
        in.close();
        return file;
    }

    /*InputStreamReader+BufferedReader读取字符串  ， InputStreamReader类是从字节流到字符流的桥梁*/
    /* 按行读对于要处理的格式化数据是一种读取的好方式 */
    public static String readString(File file) {
        int len = 0;
        StringBuffer str = new StringBuffer("");
        try {
            FileInputStream is = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader in = new BufferedReader(isr);
            String line = null;
            while ((line = in.readLine()) != null) {
                if (len != 0)  // 处理换行符的问题
                {
                    str.append("\r\n" + line);
                } else {
                    str.append(line);
                }
                len++;
            }
            in.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    /**
     * 读取一个文件的内容，将内容返回
     *
     * @param file
     * @return String
     */
    public static String readFile(File file) {
        StringBuffer retBuffer = new StringBuffer();
        if (file != null
                && file.exists()) {
            try {
                FileInputStream finputStream = new FileInputStream(file);
                byte[] buffer = new byte[512];
                int i = 1;
                while (finputStream.read(buffer, 0, 512) != -1) {
                    //System.out.println(new String(buffer, "utf-8"));
                    retBuffer.append(new String(buffer, "utf-8"));
                    buffer = new byte[512];// 每次清空缓存保证每次都是新的数据，不会遗留上次缓存的数据。
                }
                finputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return retBuffer.toString();
    }

    /**
     * @param downloadFilePath 文件路径
     * @param fileName         文件名称
     */
    public static String downLoadFile(String downloadFilePath, String fileName, HttpServletResponse response) {
        File file = new File(downloadFilePath);
        if (file.exists()) {
            response.setContentType("application/force-download");// 设置强制下载不打开            
            response.addHeader("Content-Disposition", "attachment;fileName=" + fileName);
            byte[] buffer = new byte[1024];
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            try {
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                OutputStream outputStream = response.getOutputStream();
                int i = bis.read(buffer);
                while (i != -1) {
                    outputStream.write(buffer, 0, i);
                    i = bis.read(buffer);
                }

                return "下载成功";
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (bis != null) {
                    try {
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return "下载失败";
    }

    public static void downFile(String fileName, String realPath, HttpServletResponse response) {
        //String fileName = "license_freeware.txt";// 设置文件名，根据业务需要替换成要下载的文件名
        if (fileName != null) {
            //设置文件路径
            // String realPath = "E://onlineinfo//";
            File file = new File(realPath, fileName);
            if (file.exists()) {
                response.setContentType("application/force-download");// 设置强制下载不打开
                response.addHeader("Content-Disposition", "attachment;fileName=" + fileName);// 设置文件名
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;
                try {
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    OutputStream os = response.getOutputStream();
                    int i = bis.read(buffer);
                    while (i != -1) {
                        os.write(buffer, 0, i);
                        i = bis.read(buffer);
                    }
                    System.out.println("success");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    /**
     * 从网络Url中下载文件
     *
     * @param urlStr
     * @param fileName
     * @param savePath
     * @throws IOException
     */
    public static void downLoadFromUrl(String urlStr, String fileName, String savePath) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        //设置超时间为3秒
        conn.setConnectTimeout(3 * 1000);
        //防止屏蔽程序抓取而返回403错误
        conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");

        //得到输入流
        InputStream inputStream = conn.getInputStream();
        //获取自己数组
        byte[] getData = readInputStream(inputStream);

        //文件保存位置
        File saveDir = new File(savePath);
        if (!saveDir.exists()) {
            saveDir.mkdir();
        }
        File file = new File(saveDir + File.separator + fileName);
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(getData);
        if (fos != null) {
            fos.close();
        }
        if (inputStream != null) {
            inputStream.close();
        }


        System.out.println("info:" + url + " download success");

    }

    /**
     * 从输入流中获取字节数组
     *
     * @param inputStream
     * @return
     * @throws IOException
     */
    public static byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while ((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.close();
        return bos.toByteArray();
    }

    private final String filePath = "/xhemss/gzfile";//"D:\\fileUpload\\gzfile\\";//下载的聊天记录.gz文件

    public static void main(String[] args) {
        /*try{
            downLoadFromUrl("http://101.95.48.97:8005/res/upload/interface/apptutorials/manualstypeico/6f83ce8f-0da5-49b3-bac8-fd5fc67d2725.png",
                    "百度.jpg","d:/resource/images/diaodiao/country/");
        }catch (Exception e) {
            // TODO: handle exception
        }*/
        //new FileUtil().saveFile();

    }

    public void saveDownMessage() {
        File folder = new File(filePath);
        //文件夹路径不存在
        if (!folder.exists() && !folder.isDirectory()) {
            System.out.println("文件夹路径不存在，创建路径:" + filePath);
            folder.mkdirs();
        } else {
            System.out.println("文件夹路径存在:" + filePath);
        }
        String url = "http://www.changdongjun.top/cdj/1.txt";
        String fileName = "1.txt";
        try {
            downLoadFromUrl(url, fileName, filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFile(String s) {
        File folder = new File(filePath);
        //文件夹路径不存在
        if (!folder.exists() && !folder.isDirectory()) {
            System.out.println("文件夹路径不存在，创建路径:" + filePath);
            folder.mkdirs();
        } else {
            System.out.println("文件夹路径存在:" + filePath);
        }

        saveAsFileWriter(s,filePath+"/tew.txt");

    }


}
