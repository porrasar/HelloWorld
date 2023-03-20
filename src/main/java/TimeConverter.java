import java.util.Scanner;

public class TimeConverter
{//class beg
    public static void main(String[] args)
    {//main beg


        int timeSecondsEntered = 86399;

        int seconds = timeSecondsEntered % 60;
        int hours = timeSecondsEntered / 60;
        int minutes = hours % 60;

        hours = hours / 60;


        System.out.println( hours + ":" + minutes + ":" + seconds);
        System.out.println("\n");


    }//main end
}//class end
