import java.util.Scanner;

public class Ex1
{//class beg

    public static void main(String[] args)
    {//main beg
        String firstName = "Alisa";
        String lastName = new String ("Porras");

        System.out.println(firstName +  ": "+ firstName.length());
        System.out.println(lastName + ": " + lastName.length());

        String x = new String("x");
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scannerInput.next();
        System.out.println("Your name is " + name);




    }//main end

}//class end
