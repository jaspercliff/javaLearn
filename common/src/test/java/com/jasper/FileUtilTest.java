package com.jasper;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @Author jasper @Date 2024-11-18
 *
 * @version 1.0
 */
public class FileUtilTest {

  @Test
  public void CreatFileTest() {
    File file = new File("C:\\code\\javaLearn\\common\\src\\main\\java\\com\\jasper\\utils");
    boolean directory = file.isDirectory();
    System.out.println("directory = " + directory);
  }
}
