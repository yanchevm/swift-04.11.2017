package org.o7planning.filedirectory;

import java.io.File;

public class ListFileStructure2 {

    public static void main(String[] args) {

        System.out.println("File[] listFiles():\n");

        File dir = new File("C:/Users");

        File[] children = dir.listFiles();

        for (File file : children) {
            System.out.println(file.getAbsolutePath());
        }

        System.out.println("\n-----------------------");

        System.out.println("String[] list():\n");

        String[] paths = dir.list();

        for (String path : paths) {
            System.out.println(path);
        }
    }

}