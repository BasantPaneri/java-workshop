import java.util.*;

class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        int rev;
        
        while(n>0){
            rev=n%10;
            n=n/10;
            System.out.print(rev);
        }
    }
}