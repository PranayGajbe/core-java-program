class one{
public static void main(String args[]){

int a=10;
int b=8;
int c;

if(b==0)
throw  new ArithmeticException("can't divide by zero");
else
 c=a/b;
System.out.println(c);


System.out.println("program terminated");
}
}