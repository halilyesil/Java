package abc;
import java.util.Scanner;
public class problemsofelse {
    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);
        System.out.println("what is the age=");
        int a = myKeyboard.nextInt();
        if (a<0){
            System.out.print("age cannot be negative");
        }else if(a>120){
            System.out.println("connot be larger than 120");
        }else{
            System.out.print("its ok");

            String txt = "Hello Everybody";
            System.out.println(txt.indexOf("e"));
            // i learned from web. it said where the e is

            int x = 5;
            int y = 10;
            Math.max(x, y);
            //bunu da w3schoolstan kaptim


        }
    }

}
