import java.util.*;

class SumOfDigits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        String temp=n+"";
        int sum=0;

        for(int i=0;i<=temp.length();i++){
            int ans=n%10;
            n=n/10;
            sum=sum+ans;

        }System.out.println(sum);
    }
}