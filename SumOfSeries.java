import java.util.*;

class SumOfSeries{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the last number: ");
        int b=sc.nextInt();
        long sum=0L;

        for(int i=a;i<=b;i++){
            sum=sum+i;
        }
        System.out.print("the sum is: ");
        System.out.printf("%,d" , sum);
        
    }
}