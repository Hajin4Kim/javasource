package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;

public class FileReaderEx2 {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("c:\\source\\javasource\\object\\src\\io\\FileEx.java", Charset.forName("utf-8")); 
        //TODO: 보조스트림 : 문자 기반 +  BufferedReader
            BufferedReader br = new BufferedReader(fr)
        ) {

            String str = null;
            // 줄 단위로 읽어오기
            int i = 1;
            while ((str = br.readLine()) != null) { //TODO: .readLine() = String 으로 줄 단위로 읽어올 수 있다
                System.out.println(i + "\t" + str);      
                i++;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}