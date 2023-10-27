class parent{
int a=12;
String b="pranay";
}
class chiled extends parent{
int a=14;
void display(){
System.out.println(a);
System.out.println(super.a);
System.out.println(b);
}
}
class superr{
public static void main(String args[]){
chiled s1=new chiled();
s1.display();
}
}


 

 






