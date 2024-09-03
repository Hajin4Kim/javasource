package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class FileReaderEx4 {
    public static void main(String[] args) {
        // 키보드와 입력스트림 연결
        
        // Scanner sc = new Scanner(System.in);
        // sc.close();

        try (Scanner sc = new Scanner(System.in);
            FileWriter fw = new FileWriter("c:\\temp\\input.txt");
            BufferedWriter bw = new BufferedWriter(fw);
        ) {
            // q 라는 문자가 입력되기 전까지 키보드로 입력 받아들인후
            // q 가 입력되면 입력 받아들인 문자들을 파일로 작성하기

            System.out.println("파일에 작성할 데이터를 입력해주세요");
            System.out.println("종료를 원하시면 q를 입력하세요");
            String str = null;
            int i = 1;

            String input = "";
            do {
                System.out.println(">> ");
                input = sc.nextLine();

                if (!input.equals("q")) {
                    bw.write(input);
                    bw.newLine();
                }
            } while (!input.equals("q"));

            // while ((str = sc.nextLine()) != "q") {
            //     sc.nextLine();
            //     bw.write( i + "\t"+ str);
            //     bw.newLine();
            //     i++;
            // }
        } catch (Exception e) {
            e.printStackTrace();
        }
        







    }
}
