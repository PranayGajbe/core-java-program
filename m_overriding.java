
// two or multiple method having same name but different number of argument
 or different data type of argument in two defferent classes its called method overriding  //

class m_overriding{
   public static void main(String arg[]){
   override2 s1=new override2();
   s1.print(6,4);

   }

}

class override{
   void print(int a){
   System.out.println(a);

   }

}

class  override2 extends override{
    void print(int a ,int b){
    int c=a+b;
    System.out.println(c);

    }

}