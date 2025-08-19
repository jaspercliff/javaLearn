package com.jasper.commons.commonsIO;

import com.google.common.io.CountingInputStream;
import com.google.common.io.CountingOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CountingStreamDemo {
    public static void main(String[] args) {
        String srcPath = "/Users/jasper/IdeaProjects/person/javaLearn/utils/src/main/java/com/jasper/commons/doc/1.dmg";
        String destPath = "/Users/jasper/IdeaProjects/person/javaLearn/utils/src/main/java/com/jasper/commons/doc/2.dmg";

        try (FileInputStream fileInputStream = new FileInputStream(srcPath);
             FileOutputStream fileOutputStream = new FileOutputStream(destPath)) {
            final CountingInputStream cis = new CountingInputStream(fileInputStream);
            final CountingOutputStream cos = new CountingOutputStream(fileOutputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
