package abc;
import java.util.Scanner;
public class jacketissue {
    public static void main(String[] args){
        Scanner one = new Scanner(System.in);
        System.out.print("What is the weather= ");
        int tem = one.nextInt();

        if (tem<=30){
            System.out.print("pls wear jacket");
        }else
            {System.out.print("wear hat");
        }

    }

}
