package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//TODO: 파일 복사 프로그램
public class FileInputStreamEx3 {
    public static void main(String[] args) {
        // try - with - resources
        //TODO: try(닫아야하는 자원 생성) : finally 안에 닫기 명시하지 않아도 자동으로 닫아줌
        try(FileInputStream fis = new FileInputStream("c:\\temp\\image2.jpg");
            FileOutputStream fos = new FileOutputStream("c:\\temp\\output_image.jpg")) {
            
            int data = 0;

            byte b[] = new byte[1024];
            while ((data = fis.read(b)) != -1) {
                fos.write(b);
            }
        } catch ( IOException e) {
            e.printStackTrace();
        }

        
    }
}
