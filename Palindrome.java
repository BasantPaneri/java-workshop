import java.util.*;

class Palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        long n=sc.nextLong(),rem,num=0;
        long temp=n ;

        while(n>0){
            rem=n%10;
            n=n/10;
            num=num*10+rem;
        }//System.out.println(num);

        if(num==temp){
            System.out.println(temp+" is a palindrome number");
        }else
            System.out.println(temp+" is not a palindrome number");
    }
}