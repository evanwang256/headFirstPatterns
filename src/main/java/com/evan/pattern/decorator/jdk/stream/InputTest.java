package com.evan.pattern.decorator.jdk.stream;

import java.io.*;

/**
 * Created by wangzhen318 on 2017/5/17.
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            String filename = "/Users/evanwang/idea/jd/headFistPatterns/src/main/resources/test.txt";
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(filename)));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
