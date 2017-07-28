package com.java.tech.ch08;

import java.io.*;

/**
 * 8.4 throws 와 throw 키워드로 예외 던지기
 *
 * 8-5.
 *  - $ javac com/java/tech/ch08/SampleException5.java
 *  - $ java com/java/tech/ch08/SampleException5
 */
public class SampleException5 {
    private BufferedReader br;

    public static void main(String[] args) /*throws Exception*/ {
        String filePath = "comment.txt";

        try {
            SampleException5 sample = new SampleException5(filePath);
            sample.printFile();
            sample.finalize();
        } catch (Exception e) {
            e.printStackTrace();
//            throw new Exception("error", e);
        }
    }

    // re-throw FileNotFoundException
    public SampleException5(String path) throws FileNotFoundException {
        File file = new File(path);
        br = new BufferedReader(new FileReader(file));  // FileNotFoundException
    }

    //re-throw IOException
    public void printFile() throws IOException {
        if (br == null) {
            return;
        }

        String tmpStr = "";
        while ((tmpStr = br.readLine()) != null) {  // IOException
            System.out.println(tmpStr);
        }
    }

    public void finalize() {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
