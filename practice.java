import java.util.mypackage; 
class practice{

 public static int get(int a,int b)throws Exception
{
try{
return (a/b);


}

public static void main(String [] args){
int c=get(10,0);
System.out.println(c);
}
catch(Exception ex){
ex.printStackTrace();
}



}
}