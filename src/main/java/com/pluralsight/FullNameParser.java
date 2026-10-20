package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your full name:");
        String fullName = input.nextLine().trim();

        int spaceIndex = fullName.indexOf(" ");
        String firstName = fullName.substring(0, spaceIndex);
        System.out.println("First Name: "+ firstName);



        System.out.println("Middle Name: "+ );

        String lastName = fullName.substring(spaceIndex + 1);
        System.out.println("Last Name: "+ lastName);


    }
}
