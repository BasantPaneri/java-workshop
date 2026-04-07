import java.util.*;

class PrimeNumberInSeries{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number: ");
        int n1=sc.nextInt();
        System.out.println("enter the last number: ");
        int n2=sc.nextInt();

        // if(n<=1)
        //     System.out.println(n+" is not a prime number");

        
        for(int i=n1;i<=n2;i++ ){
            boolean isPrime=true;
           // System.out.println("log info-----> printing i :"+i);
            for(int j=2;j<=i/2;j++){
               // System.out.println("log info-----> printing j :"+j);
                if(i%j==0){
                     isPrime=false;
                     break;
                }

                     
            }
            
            if(isPrime)
                        System.out.print(i+ "," );
                
        } 
    }

}
