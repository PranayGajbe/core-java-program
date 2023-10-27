

class fibonacci_series{
public static void main(String args[]){


int fibo=0,n1=0,n2=1;

System.out.print(n1+" "+n2+" ");

for(int i=1;i<=5;i++){

fibo=n1+n2;

n1=n2;
n2=fibo;
System.out.print(fibo+" ");

}
}
}
