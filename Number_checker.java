import java.util.*;

//checks the number is positive or negetive.
class Number_checker{
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        if (n<0)
            System.out.println("number "+n+" is negative");
        else if (n>0)
            System.out.println("number "+n+" is a positive number");
        else if (n==0) 
            System.out.println(n+" is a neutral number");           
    }
}