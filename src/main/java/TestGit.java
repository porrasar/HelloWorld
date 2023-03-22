import java.util.Scanner;

public class TestGit
{
    public static void main(String[] args)
    {
      //how user input info
      Scanner scannerInput1  = new Scanner(System.in);

        System.out.print("Enter your full name:");
        String nameInput = scannerInput1.nextLine();
        System.out.print("name length: ");
        int nameLength = nameInput.length();
        double nameEvenOdd;
        nameEvenOdd = nameLength % 2;
        if (nameEvenOdd == 0)
        {
            System.out.println("name string is an even number");
        }
        else
        {
            System.out.println("name string is an odd number");
        }
        System.out.println(nameLength);



        System.out.print("Enter your address:");
        String addressInput = scannerInput1.nextLine();
        System.out.print("address length: ");
        int addressLength = addressInput.length();
        double addressEvenOdd;
        addressEvenOdd = addressLength % 2;
        if (addressEvenOdd == 0)
        {
            System.out.println("address string is an even number");
        }
        else
        {
            System.out.println("address string is an odd number");
        }
        System.out.println(addressLength);


        System.out.println("thank you");




        System.out.println("hello github");
        //System.out.println("hello github2");
        //System.out.println("hello github3");
        //System.out.println("hello github4");
    }
}
