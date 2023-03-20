import java.util.Scanner;
public class HackerRankEx2
{//class beg
    public static void main(String[] args)
    {//main beg

        // CREATING A SCANNER/KEYBOARD INPUT
        Scanner scan = new Scanner(System.in);

        //ENTER INPUT
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); //clears the queue
        String s = scan.nextLine();

        //System.out.println("Please enter an integer: ");
        //System.out.println("Please enter a double: ");
        //System.out.println("Please enter String: ");

        //CLEANS OUT MEMORY
        scan.close();


        //PRINT OUTPUT
        System.out.println("\nString: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);


    }//main end

}//class end
