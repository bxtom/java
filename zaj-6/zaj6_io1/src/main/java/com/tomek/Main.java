package com.tomek;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathIn = System.getProperty("user.dir") + "\\io.txt";
        String pathOut = System.getProperty("user.dir") + "\\output.txt";
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(pathIn));
            writer = new BufferedWriter(new FileWriter(pathOut));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}
