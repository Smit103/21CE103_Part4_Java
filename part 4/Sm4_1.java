/* 
ID:21CE103
Name: Smit Patel
Repository Link: https://github.com/Smit103/21CE103_Part4_Java.git
Aim: WAP to show the try - catch block to catch the different types of exception.
*/
public class Sm4_1{
    public static void main(String[] args) {
        try{
            int a= 10/0;
            System.out.println(a);
            int b[]= {1,2,3,4,5};  
        System.out.println(b[7]);
        }
        catch(ArithmeticException e){
            System.out.println("Divide By zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of range");
        }
        finally{
            System.out.println("Finally must be execute");
        }
    }
}