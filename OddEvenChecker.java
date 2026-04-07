import java.util.*;

class OddEvenChecker{
    public static void main(String args[]){
        System.out.print("enter the number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n%2==0)
            System.out.println(n+" is an even number");
        else
            System.out.println(n+" is an odd number");
    }
}