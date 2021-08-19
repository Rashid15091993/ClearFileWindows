package com.company.deletefile;

import sun.rmi.runtime.Log;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {

    public static void main(String[] args) {
       int fileLenght = new File("C:/Windows/Temp").list().length;

       if (fileLenght > 10) {
           String path = "C:/Windows/Temp";
           for (File myFile : new File(path).listFiles())
               if (myFile.isFile()) myFile.delete();
       }
       System.out.print(fileLenght);
    }
}
