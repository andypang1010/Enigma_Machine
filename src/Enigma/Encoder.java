package Enigma;

import java.util.Random;

public abstract class Encoder extends Helper {

    public static void scramble(char[] arr) {
        Random random= new Random();
        int randomIndex;
        for (int i= 0; i < arr.length; i++ ) {
            randomIndex= random.nextInt(26);
            Helper.swap(arr, i, randomIndex);
        }
    }

    public static char[] encodeWord(char[] arr, char[] alphabets, char[] scrambledAlphabets) {
        char[] results= new char[arr.length];
        int alphaIndex= 0;
        for (int i= 0; i < arr.length; i++ ) {
            alphaIndex= findIndex(alphabets, arr[i]);
            results[i]= scrambledAlphabets[alphaIndex];
        }
        return results;
    }

    public static String encodeInput(String input, char[] alphabets, char[] scrambledAlphabets) {
        String output= "";
        String[] inputs= input.split(" ");

        for (String word : inputs) {
            char[] inputArr= word.toCharArray();
            char[] results= encodeWord(inputArr, alphabets, scrambledAlphabets);
            String result= new String(results);
            output+= result + " ";
        }

        return output;
    }
}
