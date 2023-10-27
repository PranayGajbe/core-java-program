import java.util.*;
class reverse
{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int n, reversed_nu=0, remainder;
        System.out.println("enter a number to reverse");

        n=sc.nextInt();

        if(n!=0){
        remainder=n%10;
        reversed_nu=reversed_nu*10+remainder;
        n/=10;
        System.out.println("reversed number = " +n);
    }
    }
}
