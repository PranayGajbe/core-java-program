class inheritancee{

   public static void  main(String args[]){
   child s1=new child();
   int b=child.operation();
   s1.operation();

   }

}


class parent{
   int c;
   int roll_no=1;
   String name="pranay";int  operation(int a,int b){

   int c=a*b;
   return c;

   }

}

class child extends parent{
   String mo_nu="1234567";
   int dress_nu=12;
   void operation(int a ,int b){
   int c =a-b;
   System.out.println(c);

   }

}




