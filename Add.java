import java.util.Scanner;
class Add
{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first number");
        int a=scan.nextInt();
        System.out.println("enter second number");
        int b=scan.nextInt();
        System.out.println("enter third number");
        int c=scan.nextInt();
        System.out.println("enter fourth number");
        int d=scan.nextInt();
        System.out.println("enter fifth number");
        int e=scan.nextInt();
        int sum=a+b+c+d+e;
        System.out.println("sum of 5 Number are="+sum);
    }
}