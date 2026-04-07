import java.util.*;

class Exponents{
    static int Power(int n1,int p){
        int n=1;
        for(int i=0;i<p;i++){
           
            n=n*n1;
        }
        System.out.println(n);
        return p;
    }
    public static void main(String args[]){
        int ans=Power(5, 3);
        //System.out.println(ans);
    }
}