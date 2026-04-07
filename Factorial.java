import java.util.*;

class Factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        long n=sc.nextLong();
        long mul=1L;

        for(int i=1;i<=n;i++){
            mul=mul*i;
        }System.out.println(mul);
    }
}