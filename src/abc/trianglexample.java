package abc;
import java.util.Scanner;
public class trianglexample {
    public static void main(String[] args){
        System.out.print("Waht is A =");
        Scanner one=new Scanner(System.in);
        int A = one.nextInt();
        System.out.print("Waht is B =");
        Scanner two=new Scanner(System.in);
        int B = two.nextInt();
        System.out.print("Waht is C =");
        Scanner three=new Scanner(System.in);
        int C = three.nextInt();

        if(A+B > C& A+C>B& B+C>A){
            System.out.println("This is a Triangle");
        }else{
            System.out.print("This is not a Triangle");
        }
    }
}
// scanner fazladan yazmışım en baştaki one sadece benim işimi görebiliyor.