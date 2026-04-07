import java.util.*;

class Sum{
    public static void main(String args[]){
        System.out.println("enter the last number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0L;

        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        
        System.out.print("the sum is: ");
        System.out.printf("%,d" , sum);
    }
}