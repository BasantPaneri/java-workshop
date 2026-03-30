import java.util.*;

class GreatestOfTwo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number: ");
        double a=sc.nextDouble();
        System.out.print("enter number: ");
        double b=sc.nextDouble();

        if(a<b)
            System.out.println(b+" is greater than "+a);
        else if(a>b)
            System.out.println(a+" is greater than "+b);
        else
            System.out.println("both numbers are equal");
    }
}