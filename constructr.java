class con{
int roll;
String name;
String branch;

void conn(int roll,String name){
this.roll=roll;
this.name=name;
  System.out.println(roll);
  System.out.println(name);
}

void conn(String branch){
this.branch=branch;
}
}

class constructr
{
public static void main(String args[])
{
con s1=new con();
s1=conn(2,"pranay");
}
}


