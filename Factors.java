import java.util.*;

class Factors{
    static void FactorsOf(int a){
        for(int i=2;i<a;i++){
            if(a%i==0)
                System.out.print(i+",");
            //System.out.println("no");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();

        System.out.print("factors of "+n+" are: ");
        FactorsOf(n);
    }
}