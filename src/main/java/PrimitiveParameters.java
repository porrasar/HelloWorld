public class PrimitiveParameters
{//class beg

    public static void main(String[] args)
    {//main beg
        go();
    }//main end

    public static void go()
    {//go beg
       int x = 3;
       int y = 2;
       System.out.println("In method go. x: "+ x + " y: " + y);
        falseSwap(x,y);
       System.out.println("In method go. x: "+ x + " y: " + y);
        moreParameters(x,y);
       System.out.println("In method go. x: "+ x + " y: " + y);
    }//go end


    public static void falseSwap(int x, int y)
    {//falseswap beg

        System.out.println("In method falseSwap. x: "+ x + " y: " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("In method falseSwap. x: "+ x + " y: " + y);

    }//falseswap end

    public static void moreParameters(int a, int b)
    {//moreparameters beg
        System.out.println("In method moreParameters. a: " + a + " b: " + b);
        a = a * b;
        b = 12;
        System.out.println("In method moreParameters. a: " + a + " b: " + b);
        falseSwap(b,a);
        System.out.println("In method moreParameters. a: " + a + " b: " + b);
    }//moreparameters end

}//class end
