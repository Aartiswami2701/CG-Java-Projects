package com.cg.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.io.File;

public class TryWithResources {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\AASWAMI\\JAVA PROJECTS\\core_java_projects\\output.txt";
        
        File file = new File(filePath);
        
       // System.out.println(file);
        if (!file.exists()) {
            System.out.println("File does not exist at: " + filePath);
            return;
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
