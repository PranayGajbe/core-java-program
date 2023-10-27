 class ffinally
{
public static void main(String args[])
{
try
{
int arr[]=new int[2];
arr[0]=10;
arr[1]=20;
arr[2]=30;
System.out.println(arr[2]);
}
catch(ArithmeticException ex)
{

System.out.println("Arithmetic Exception");
}
finally
{
System.out.println("program terminated");
}
}
}



