import java.util.*;
class inheritance{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,reversed_no=0;
n=sc.nextInt();
 
while(n!=0){

int digit=n%10;
reversed_no=reversed_no*10+digit;
n/=10;

}
System.out.println(reversed_no);


}
}