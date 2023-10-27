class student{

int roll_no=1;
String name="pranay";

void print( int a){
System.out.println(a);
}

void print(int a,int b){
int c=a+b;
System.out.println(c);
}



}

class overload_method{
public static void main(String args[]){

student s1=new student();
s1.print(2);

}
}

