import java.util.*;
class gdb{
public static void main(String args[]){

 int n=4004, reversed_nu=0,backup=n;
  
while(n!=0){

int digit=n%10;
reversed_nu=reversed_nu*10+digit;
n/=10;


}



if(reversed_nu==backup)
{
System.out.println("palindrom");
}
else{
System.out.println("not palindrom");

}
System.out.println(backup);
}
}







