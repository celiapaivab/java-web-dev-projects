package org.launchcode;

import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of" +
                " having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought " +
                "Alice ‘without pictures or conversation?’";
        alice = alice.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Text a term to search for: ");
        String term = input.nextLine();

        term = term.toLowerCase();
        boolean check = alice.contains(term);
        System.out.println(check);

        int index = alice.indexOf(term);
        int length = term.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedAlice = alice.replace(term, "(YOUR TERM WAS HERE)");
        System.out.println(modifiedAlice);

    }
}
