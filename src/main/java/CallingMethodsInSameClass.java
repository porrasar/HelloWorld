public class CallingMethodsInSameClass
{//class beginning
    public static void main(String[] args)
    {//main beginning
        printOne();
        printOne();
        printTwo();

    }//main end

    public static void printOne()
    {//printone beg
        System.out.println("Hello World");
    }//printone end


    public static void printTwo()
    {//printtwo beg
        printOne();
        printOne();
    }//printtwo end

}//class end
