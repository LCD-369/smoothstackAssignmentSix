package com.louis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		StringBuilder sbuilder = new StringBuilder();
        String stringLine = "";
        try {
             String filename = "/Users/louiscdiaz/Desktop/myfile.txt";
             FileWriter fwriter = new FileWriter(filename, true); 
             System.out.println("Enter text for file writer: ");
     		 Scanner scanner = new Scanner(System.in);
     		 String messageforfilewriter = scanner.next();
     		 scanner.close();
             fwriter.write(messageforfilewriter);
             fwriter.write(" \n");
             fwriter.close();
             BufferedReader buffreader = new BufferedReader(new FileReader("/Users/louiscdiaz/Desktop/myfile.txt"));
            
             while (stringLine != null){
                sbuilder.append(stringLine);
                sbuilder.append(System.lineSeparator());
                stringLine = buffreader.readLine();
                System.out.println(stringLine);
             }
             buffreader.close();
           }catch(IOException ioe){
            System.err.println("IOException: " + ioe.getMessage());
           }
        }

}


