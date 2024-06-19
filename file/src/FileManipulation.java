package com.kar.practice.exercise.file.src;

import java.io.*;
import  java.nio.file.*;

public class FileManipulation {
    public static void main(String[] args) throws IOException {

        String sourceFilePath = "Source.txt";
        String destinationFilePath = "Destination.txt";

        // Creating File
        File sourcefile = new File(sourceFilePath);

        if (sourcefile.createNewFile()) {
            System.out.println("File created successfully.");
        } else {
            System.out.println("File already exists.");
        }

        File destinationFile = new File(destinationFilePath);

        if (destinationFile.createNewFile()) {
            System.out.println("File created successfully.");
        } else {
            System.out.println("File already exists.");
        }


        // Writing File
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(sourceFilePath))) {
            writer.write("Hello, Writing To Source File! ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading File
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath))) {
            String line = reader.readLine();
            System.out.println("Reading Source File after Writing: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Appending File
        try (BufferedWriter appendWriter = new BufferedWriter(new FileWriter(sourceFilePath, true));
             BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath))) {
            appendWriter.write("Appending to File.");
            String append = reader.readLine();
            System.out.println("Reading Source File after Appending: " + append);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Copying a File
        Path sourcePath = Paths.get(sourceFilePath);
        Path destinationPath = Paths.get(destinationFilePath);
        try {
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading the Copied File
        try (BufferedReader reader = new BufferedReader(new FileReader(destinationFilePath))) {
            String copy = reader.readLine();
            System.out.println("Reading Copied File: " + copy);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Removing Content in File
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(sourceFilePath));
             BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath))) {
            writer.write("");
            System.out.println("Content Removed Successfully.");
            String remove = reader.readLine();
            System.out.println("Reading after Removing Content: " + remove);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deleting File
        try {
            Files.deleteIfExists(sourcePath);
            System.out.println("Source File deleted successfully.");
            Files.deleteIfExists(destinationPath);
            System.out.println("Destination File deleted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

