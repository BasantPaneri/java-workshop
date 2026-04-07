import java.util.*;

class PrimeFactors{
    
        static void primeFactorsOf(int n){
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
    }
        
        
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();

        primeFactorsOf(n);
    }
}