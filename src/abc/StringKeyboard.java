package abc;

import java.util.Scanner;

public class StringKeyboard {
    public static void main(String [] args){

        Scanner myKeyboard = new Scanner(System.in);

        System.out.println("Please Enter your name:");

        String name1 = myKeyboard.nextLine();
        System.out.println("Your name is: " + name1);


        //String name1 = myKeyboard.nextString();

        /*
        String name2;
        name2 = myKeyboard.nextLine();*/




    }
}
