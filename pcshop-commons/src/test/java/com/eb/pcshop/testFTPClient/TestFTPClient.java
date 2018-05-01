package com.eb.pcshop.testFTPClient;

import com.eb.pcshop.commons.util.FtpUtil;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by 孔泽琦 on 2018/4/28.
 */
public class TestFTPClient {

    @Test
    public  void  test1() throws IOException {
        FTPClient ftpClient=new FTPClient();
        ftpClient.connect("116.62.199.189",21);
        //登录
        ftpClient.login("ftpuser","1314zhi20");
        //读取本地文件
        FileInputStream inputStream= new FileInputStream(new File("e:\\3.png"));
        //上传的路径
        ftpClient.changeWorkingDirectory("/home/ftpuser/www/images");
        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

        //上传文件
        ftpClient.storeFile("haha5.png",inputStream);
        inputStream.close();
        ftpClient.logout();

    }

    @Test
    public  void test2() throws FileNotFoundException {
        FileInputStream inputStream=new FileInputStream(new File("e:\\3.png"));
        FtpUtil.uploadFile("116.62.199.189",21,"ftpuser","1314zhi20","/home/ftpuser/www/images",
                            "2018/04/28","haha1.png",inputStream);
   }

}
