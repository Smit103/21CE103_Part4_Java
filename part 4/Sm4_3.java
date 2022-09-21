/* 
ID:21CE103
Name: Smit Patel
Repository Link: https://github.com/Smit103/21CE103_Part4_Java.git
Aim: Write a program that raises two exceptions. 
Specify two ‘catch’ clauses for the two exceptions. 
Each ‘catch’ block handles a different type of exception.
For example the exception could be ‘ArithmeticException’ 
and ‘ArrayIndexOutOfBoundsException’. 
Display a message in the ‘finally’ block.
*/
public class Sm4_3 {
    public static void main(String[] args) {
        try{
            int a= 10/0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println("Divide By zero");
        }
        finally{
            System.out.println("Finally must be execute");
        }
        try{
            int b[]= {1,2,3,4,5};  
            System.out.println(b[7]);
        }
     
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The Array is  out of range");
        }

       
    }
}
