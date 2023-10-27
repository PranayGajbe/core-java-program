/*Abstraction is an important concept of object-oriented programming 
that allows us to hide unnecessary details and only show the needed information.*/

abstract class ma{
int roll=10;

abstract void method();


}

class ab extends ma{

void method(){
System.out.println("roll no is: "+roll);

}


}

class abstraction{
public static void main(String args[]){
ab s1=new ab();
s1.method();




}


}