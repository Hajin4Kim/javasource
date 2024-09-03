package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//TODO: 파일 복사 프로그램
public class FileInputStreamEx4 {
    public static void main(String[] args) {
        // try - with - resources
        //TODO: try(닫아야하는 자원 생성) : finally 안에 닫기 명시하지 않아도 자동으로 닫아줌
        try(FileInputStream fis = new FileInputStream("c:\\temp\\image2.jpg");
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream("c:\\temp\\output_image.jpg");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ) {
                
            int data = 0;

            // bis 와 bos 사용하면 속도가 훨 빨라짐
            byte b[] = new byte[4096];
            while ((data = bis.read(b)) != -1) {
                bos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        
    }
}
