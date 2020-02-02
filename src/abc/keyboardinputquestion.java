package abc;
import java.util.Scanner;
public class keyboardinputquestion {
    public static void main(String[] args){
        Scanner a= new Scanner(System.in);

        System.out.println("Side a:");
        float sidea= a.nextFloat();
        System.out.println("Side b:");
        float sideb= a.nextFloat();


        System.out.println("all:"+ sidea*sideb);



    }
}
