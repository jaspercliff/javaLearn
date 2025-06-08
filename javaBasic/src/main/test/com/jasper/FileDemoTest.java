package com.jasper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.nio.file.Path;

public class FileDemoTest {
    @TempDir
    Path tempDir;

    @Test
    public void test() {
        final File file = tempDir.toFile();
        System.out.println(file);
        final File file1 = new File(file, "test.txt");
        System.out.println("file1 = " + file1);
    }
}
