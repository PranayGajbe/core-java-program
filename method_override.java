class me
{
int roll=23;
String name="pranay";
void display()
{
System.out.println("Roll no is :" +roll);
System.out.println( "name is :" +name);
}
}

class met extends me
{
int java = 60;
int data_structur=70;
void display()
{

System.out.println(java);
System.out.println(data_structur);
}
}


class method_override
{
public static void main(String args[])
{

met s1=new met();
s1.display();
}
}

