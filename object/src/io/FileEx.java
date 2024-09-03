package io;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        // 
        File f = new File("c:\\temp\\test.txt");

        String fileName = f.getName();
        int pos = fileName.lastIndexOf("."); // 맨 뒤에서부터 찾기 (".")을 

        System.out.println("경로를 제외한 파일명 : " + f.getName()); // test.txt
        System.out.println("확장자를 제외한 파일명 : " + fileName.substring(0, pos)); // test 만 잘라내기
        System.out.println("확장자 : " + fileName.substring(pos + 1)); // txt 만 잘라내기
        System.out.println("경로를 포함한 파일명 : " + f.getPath()); // c:\temp\test.txt
        System.out.println("파일 절대 경로 : " + f.getAbsolutePath());
        System.out.println("파일이 속해 있는 디렉토리 : " + f.getParent());
        System.out.println();
        // 리눅스(. , /), 윈도우즈(; , \) 상태에 따라 
        System.out.println("File.pathSeparator(경로구분자) : " + File.pathSeparator);
        System.out.println("File separatorChar : " + File.separatorChar);
        System.out.println("File.separator(이름구분자) : " + File.separator);
        System.out.println("File.separatorChar : " + File.separatorChar);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
