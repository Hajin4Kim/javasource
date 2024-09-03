package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//TODO: 파일 복사 프로그램
public class FileInputStreamEx2 {
    public static void main(String[] args) {
        // 입력스트림 : file 에서 읽어오기
        FileInputStream fis = null;
        // 출력스트림 : file 에 쓰기
        FileOutputStream fos = null;
        try {
            // fis = new FileInputStream(new File("c:\\temp\\file1.txt"));
            // fis = new FileInputStream("c:\\temp\\file1.txt");
            fis = new FileInputStream("c:\\temp\\image2.jpg");

            // fos = new FileOutputStream("c:\\temp\\output1.txt");
            fos = new FileOutputStream("c:\\temp\\output_image.jpg");

            int data = 0;
            // read() : 1byte 씩 읽어오기 => 파일 크기가 크면 부담스러운 방법
            // while ((data = fis.read()) != -1) {
            //     // System.out.print((char) data); // TODO: 한글은 ?로 깨져서 옴
            //     fos.write(data); //TODO: ,파일로 내보내기시엔 한글이 깨지지않고 파일에 전달된다
            // }

            // 1024 byte로 읽고, 1024 바이트로 쓰라는 뜻
            byte b[] = new byte[1024];
            while ((data = fis.read(b)) != -1) {
                fos.write(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
