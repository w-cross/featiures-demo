package com.example.newfeature.features;

import java.io.*;
import java.util.ArrayList;

public class Features10 {
    public static void main(String[] args) {

        var x1 = new ArrayList<String>();
        var x2 = "abs";
        System.out.println(x2);

        try {
            var fileInputStream = new FileInputStream("/Users/apple/Desktop/in.txt");
            var outPutStream = new FileOutputStream("/Users/apple/Desktop/out.txt");
            fileInputStream.transferTo(outPutStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
