class tthrows{


public static int div(int x, int y)throws Exception
{
try{
return (x/y);
}
public static void main(String args[]){
int d=div(10,0);
System.out.println(d);

}

catch(Exception ex){
ex.printstacktrace();
}
}


}
 

