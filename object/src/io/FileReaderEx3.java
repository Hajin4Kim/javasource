package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class FileReaderEx3 {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("c:\\source\\javasource\\object\\src\\io\\FileEx.java", Charset.forName("utf-8")); 
        //TODO: 보조스트림 : 문자 기반 +  BufferedReader
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("c:\\temp\\source.txt");
            BufferedWriter bw = new BufferedWriter(fw)) {

            String str = null;
            int i = 1;
            // 줄 단위로 쓰기
            while ((str = br.readLine()) != null) { //TODO: .readLine() = String 으로 줄 단위로 읽어올 수 있다
                bw.write(i + "\t" + str);      
                bw.newLine();
                i++;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}