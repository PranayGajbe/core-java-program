import java.util.*;
class linked_list_deletion{
public static void main(String args[]){


LinkedList<String> l1=new LinkedList();
l1.add("one");
l1.add("tow");
l1.add("three");
l1.add("four");
l1.add("five");

for(int i=0;i<l1.size();i++){

String  x=l1.get(i);
System.out.println(x + " ");
}

System.out.println();

l1.remove("three");
l1.remove("1");

System.out.println();

l1.remove();

for(int i=0;i<l1.size();i++){


}
}

}