class trycatch{
public static void main(string args[]){


try{
int [] arr=new int[2];
arr[0]=10;
arr[1]=20;
arr[2]=30;
System.out.println(arr[2]);

}catch(Exception ex){

ex.PrintstackTrace();

}
}
}