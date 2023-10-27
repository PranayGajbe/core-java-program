class gar
{
int i=10;
int j=20;
 protected void finalize()
{
System.out.println("finalize method executed");
}
}

class garbage
{
public static void main(String args[])
{
gar s1=new gar();;

System.out.println(s1.i);
System.out.println(s1.j);

s1=null;
System.gc();
}
}
 
