
// has a relationship

// aggregation


class student{

    
    int c;

    void print(int a ,int b){
    c=a+b;

    System.out.println(c);


   }

}

class employee {
     student s1=new student();

    void print(){
    System.out.println("i am in a function");
    System.out.println(c);

    }

}


class aggregation{

      public static void main(String args []){

      employee s2=new employee();
      s2.super.print(3,5);




       }
}









