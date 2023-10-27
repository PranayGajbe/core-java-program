
import java.util.*;
class Bubble_sort{

public static void main(String args[]){

//bubble short
//creating the array

Scanner sc=new Scanner(System.in);
System.out.println("enter the size of an array");
int n=sc.nextInt();

int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();

}
System.out.println(" printing the exiting array");
for(int i=0;i<n;i++){
System.out.println(arr[i]);

}

int temp;



for(int i=0;i<n;i++){

for(int j=0;j<n;i++){
if(arr[j]<arr[j+1])
{

temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;

}
}
}

System.out.println("Array after bubble sort");

for(int i=0;i<n;i++){

System.out.println(arr[i]);

}






}


}
