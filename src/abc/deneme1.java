package abc;
import java.util.Scanner;
public class deneme1 {
    public static void main(String[] args){
        Scanner myKeyboard= new Scanner(System.in);

        System.out.print("insert MSRP:");
        float a= myKeyboard.nextFloat();
        System.out.print("insert discount:");
        float b= myKeyboard.nextFloat();
        System.out.print("insert down payment:");
        float c= myKeyboard.nextFloat();

        System.out.println((a*b-c)/12);




    }
}
