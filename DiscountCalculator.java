import java.util.*;

class DiscountCalculator{
    static double discount(double mrp,double dis)
    {
        double fp=0;
        if(dis<100 && dis>0){
           fp=mrp*((100-dis)/100);
           // System.out.println(fp);
            
        }else System.out.println("invalid input");
            
        return fp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the mrp: ");
        double mrp=sc.nextDouble();
        System.out.print("enter the discount %: ");
        double dis=sc.nextDouble();

        System.out.print("final price after discount: ");
        System.out.println(discount(mrp, dis));
    }
    
}