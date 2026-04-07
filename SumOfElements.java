import java.util.*;

class SumOfElements{
    static void addElements(int...A){
        int sum=0;
        for(int i=0;i<=A.length-1;i++){
            sum=sum+A[i];
        }System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of elements: ");
        int n=sc.nextInt();
        int A[]=new int[n];

        System.out.print("enter the numbers: ");
        for(int i=0;i<n;i++){
            
            A[i]=sc.nextInt();
        }
        addElements(A);
    }
}