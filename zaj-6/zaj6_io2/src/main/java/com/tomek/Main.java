package com.tomek;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = System.getProperty("user.dir") + "\\output.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            String line;
            do {
                line = scanner.nextLine();
                bufferedWriter.write(line + "\n");
            } while (!line.equals("exit"));
        }
    }
}
