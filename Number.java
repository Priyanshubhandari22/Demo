import java.util.Scanner;
class Number
{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int a=scan.nextInt();
        if(a>=0)
        System.out.println("Number is positive");
        else
        System.out.println("Number is negative");

    }
}