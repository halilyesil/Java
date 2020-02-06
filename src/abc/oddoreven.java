package abc;
import java.util.Scanner;
public class oddoreven {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        System.out.print("insert any number= ");
        int a = num.nextInt();

        if(a%2==0){

            System.out.print("even");
        }
        else {
            System.out.print("odd!");


        }


    }
}
