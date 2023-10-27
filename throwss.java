import java.util.*;
class throwss{

public static int div(int x, int y)throws Exception

{

return (x/y);

}
public static void main(String args[]){
try{

int d=div(10,0);

System.out.println(d);
}
catch(Exception ex){
ex.printStackTrace();

}

}
}








 

