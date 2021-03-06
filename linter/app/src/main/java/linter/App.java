/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;


import java.io.*;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public boolean getGreeting() {
        return true;
    }

    public static void main(String[] args) {

        fileReader("app/src/main/resources/gates.js");
//        System.out.println(new App().getGreeting());
    }

    public static ArrayList<String> fileReader(String file)
    {        ArrayList<String> err = new ArrayList<>();
        try {

            // open file to read
            Scanner scanner = new Scanner(new File(file));
            int linNum =0;
            System.out.println("file opened");
            // read until end of file (EOF)
            String data = scanner.nextLine();
            while (scanner.hasNextLine()) {

                System.out.println(scanner.nextLine());
                if (data.startsWith("//")&&data.endsWith(";") && data.endsWith("}") && data.endsWith("{") && data.contains("if") && data.contains("else")) {
//                    System.out.println(data);
//                    err.add("Line " + linNum + " : Missing semicolon.");
//                    System.out.println("Line : " + linNum + "  Missing semicolon.");
                    linNum++;


                } else {
                    linNum++;
                    err.add("Line " + linNum + " : Missing semicolon.");
                    System.out.println("Line : " + linNum + "  Missing semicolon.");
                }

                data = scanner.nextLine();

                linNum++;
            }
                // close the scanner
                scanner.close();
                System.out.println("file closed");

         }catch (FileNotFoundException e) {
            System.err.println("an error occured");
            e.printStackTrace();
        }
        return err;
    }

}