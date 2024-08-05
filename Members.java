/*ORDER OF EXECUTION OF STATIC AND NON-STATIC MEMBERS.
1. STATIC Initializers
2. STATIC variables
3. NON-STATIC Initializers
4. NON-STATIC variables*/


package static_and_non_static_members;
public class Members {

    //static variables
    static int a=5;
    static float f1=2.2f;
    static String s="aman";
    static boolean bl;

    //Static Initializers
    static{
        System.out.println("hello aman!!");
    }

    //Non-static variables
    int b=6;
    float f2=6.6f;
    String s1="gupta";
    boolean bl1;

    //Non-static Initilaizers
    {
        System.out.println("hello gupta ji!!");
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(f1);
        System.out.println(s);
        System.out.println(bl);

        Members obj=new Members();
        System.out.println(obj.b);
        System.out.println(obj.f2);
        System.out.println(obj.s1);
        System.out.println(obj.bl1);

        

    }

   
    
}
