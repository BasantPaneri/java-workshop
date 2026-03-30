import java.util.*;

class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();

        if(n<=1)
            System.out.println(n+" is not a prime number");

        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.println(n+" is not a prime number");
                break;
            }
                System.out.println(n+" is a prime number");
                break;
                
        }
            
        }

    }
