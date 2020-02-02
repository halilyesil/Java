package abc;

import java.util.Scanner;

public class keyboardexam {
    public static void main(String[] args) {

        Scanner myKeyboard = new Scanner(System.in);
        int edge1= myKeyboard.nextInt();
        int edge2= myKeyboard.nextInt();
        int edge3= myKeyboard.nextInt();

        System.out.print("triangle perimeter = ");
        System.out.print(edge1+edge2+edge3);



    }
}
