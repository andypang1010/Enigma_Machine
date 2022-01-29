package Enigma;

import java.util.Scanner;

public class Main extends Encoder {

    public static void main(String[] args) throws InterruptedException {
        Scanner inputScanner= new Scanner(System.in);

        char[] alphabets= new char[26];
        for (char c= 'A'; c <= 'Z'; c++ ) {
            alphabets[c - 'A']= c;
        }
        final char[] ALPHABETS= alphabets.clone();

        boolean exitProgram= false;
        while (!exitProgram) {
            scramble(alphabets);

            printTable(ALPHABETS, alphabets);

            System.out.print("Please enter a sentence to be encoded: ");
            String input= inputScanner.nextLine().toUpperCase();
            String output= encodeInput(input, ALPHABETS, alphabets);

            System.out.println(output);

            System.out.println();
            System.out.println();

            System.out
                .print("Please enter \"exit\" to exit program; Enter any other keys to continue: ");
            input= inputScanner.nextLine().toUpperCase();

            if (input.equals("EXIT")) {
                exitProgram("Thank you for using the Enigma Machine!");
                inputScanner.close();
            }

            System.out.println();
            System.out.println();
        }

    }
}