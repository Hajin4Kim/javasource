package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialEx2 {
    public static void main(String[] args) {

        // 객체상태로 저장된 파일 읽기
        /*
        Person [name=홍길동, job=엔지니어]
        Person [name=성춘향, job=교사]

        // TODO: Person.java 에서 transient 넣은 후
        Person [name=홍길동, job=엔지니어, email=null]
        Person [name=성춘향, job=교사, email=null]
         */
        try (FileInputStream fis = new FileInputStream("c:\\temp\\person.dat");
                BufferedInputStream bis = new BufferedInputStream(fis);
                ObjectInputStream ois = new ObjectInputStream(bis)) {

            for (int i = 0; i < 2; i++) {
                Person p1 = (Person) ois.readObject();
                System.out.println(p1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
