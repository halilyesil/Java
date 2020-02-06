package abc;
import java.util.Scanner;
public class Tempetureofeason {
    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);
        System.out.print("What is the tempature=");
        int a= myKeyboard.nextInt();
        if (a<=20)
        {
            System.out.println("winter");
        }
        else if((21<a)&&(a<40))
        {
            System.out.println("fall");
        }
        else if((41<a)&&(a<60))
        {
            System.out.println("Spring");
        }
        else
            {
            System.out.println("Summer");
        }


    }
}
