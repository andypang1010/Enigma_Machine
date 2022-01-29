package Enigma;

public abstract class Helper {

    public static void printTable(char[] alphabets, char[] scrambledAlphabets) {
        System.out.println("ALPHABETS REFERENCE TABLE");
        System.out.println("---------------------------------");
        printArr(alphabets);
        printArr(scrambledAlphabets);

        System.out.println();
        System.out.println();
    }

    public static void swap(char[] arr, int i, int j) {
        char temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

    public static int findIndex(char[] arr, char c) {
        for (int i= 0; i < arr.length; i++ ) {
            if (arr[i] == c) { return i; }
        }
        return -1;
    }

    public static void printArr(char[] arr) {
        for (int i= 0; i < arr.length; i++ ) {
            System.out.print("|" + arr[i]);
        }
        System.out.println("|");
    }

    public static void exitProgram(String str) throws InterruptedException {
        System.out.println();
        System.out.println(str);
        Thread.sleep(3000);
        System.exit(0);
    }
}