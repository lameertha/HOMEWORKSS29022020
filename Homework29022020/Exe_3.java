package Homework29022020;

import java.util.Scanner;

public class Exe_3 {
    public static void main(String[] args) {//main method
        Exe_3 ex = new Exe_3();//object created
        ex.vowel();//calling instance method to main method
    }

    public void vowel() {//instance method
        Scanner in = new Scanner(System.in);//scanner class
        System.out.print("Input an alphabet: ");
        String input = in.next().toLowerCase();

        boolean uppercase = input.charAt(0)  >=65 && input.charAt(0) <=90;
        boolean lowercase = input.charAt(0) >=97 &&input.charAt(0) <=122;
        boolean vowels = input.equals("A") ||
        input.equals("E") ||input.equals("I")
||input.equals( "O") ||
        input.equals( "U" );//alphabets selected
        if ( input.length()>1) {
            System.out.println( "Error.Not a single character");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Error.Not a letter.Enter uppercase or lowercase letter" );//printing statement
        } else if (vowels) {
            System.out.println( " Input letter is Vowel" );
        } else {//else statement
            System.out.println("Input letter is Consonant" );
        }
    }
}