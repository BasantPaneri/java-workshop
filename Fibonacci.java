import java.util.*;

class Fibonacci{
    public static void main(String args[]){
        System.out.print("enter starting two numbers: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("enter the number of times you want to repeat it: ");
        int n=sc.nextInt();
        System.out.print(a+","+b+",");

        for(int i=0;i<=n-3;i++){
            int c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}