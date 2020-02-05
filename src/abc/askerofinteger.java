package abc;
import java.util.Scanner;
public class askerofinteger {

    public static void main(String [] args) {
        Scanner myKeyboard = new Scanner(System.in);
        System.out.print("insert integer=");
        int userinput = myKeyboard.nextInt();

        if (userinput%2 == 1){
            System.out.println("thats odd!");

            // 3 is an odd 4 is an even number
        }

    }
}
