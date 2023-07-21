package com.ohgiraffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {

    public static void main(String[] args) {
        /* FileWriter를 이해하고 사용할 수 있다.
        * FileOutputStram과 기본적인 사용 방법은 동일하나
        * 1byte가 아닌 character 단위로 출력할 수 있으므로 write 메소드의 인자가 char[] 또는 String으로 다뤄질 수 있다. */

        try (FileWriter fw = new FileWriter("testWriter.txt")) {

            fw.write(97);

            fw.write('A');

            fw.write(new char[] {'a', 'p', 'p', 'l', 'e'});

            fw.write("우리나라 대한민국");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
