/* 
ID:21CE103
Name: Smit Patel
Repository Link: https://github.com/Smit103/21CE103_Part4_Java.git
Aim: WAP to generate user defined exception using “throw” and “throws” keyword.
*/
public class Sm4_2 {
    
    static void S1() throws MyException
    {
        System.out.println("In S1. ");
        throw new MyException("User defined Exception ");
    }
    public static void main(String args[])
    {
        try
        {
            S1();
        }
        catch(MyException e)
        {
            System.out.println(e);
        }
    }
}