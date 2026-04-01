import java.util.*;

class MaxVarArgs{
    static int max(int...A){
        if (A.length==0) return Integer.MIN_VALUE;
        int m=A[0];

        for(int i=0;i<A.length;i++){
            if(m<A[i])
                m=A[i];
        }System.out.println(m);
        return (m);
    }

    public static void main(String[] args) {
        int a=max(1);
    }

}