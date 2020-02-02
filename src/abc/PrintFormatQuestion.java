package abc;

public class PrintFormatQuestion {
        public static void main(String[] args){

            String a = "Java is fun";
            float b = 78.98f;
            double c = 78.98;


            System.out.format("Do you think %s\n",a);
            System.out.format("\t Yes %% %f of people think it is fun\n",b);
            System.out.format("\t Yes %% %.2f of people thinks it is fun", c);



        }
}
