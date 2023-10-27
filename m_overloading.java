class overloading{

//two or multiple method having same method name but defferent number of argument and defferent return type.
// so its called method overloading 

int a;

void first(){

System.out.println(" this is first method");   

}
void first(int a,int b){
int c=a+b;
System.out.println(c);
}

void first(int aa){

a=aa;
System.out.println(a);


}
}

class m_overloading{
public static void main(String args []){
overloading s1=new overloading();

s1.first(6);
}
}













