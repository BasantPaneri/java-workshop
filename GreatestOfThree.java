import java.util.*;

class GreatestOfThree{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number: ");
        double a=sc.nextDouble();
        System.out.print("enter number: ");
        double b=sc.nextDouble();
        System.out.print("enter number: ");
        double c=sc.nextDouble();

        if(a>b && a>c)
            System.out.println(a+ " is greatest of all");
        else if(b>a && b>c)
            System.out.println(b+ " is greatest of all");
        else
             System.out.println(c+" is greatest of all");
    }
}