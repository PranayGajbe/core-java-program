class Bubble_short{
public static void main(String args[]){

//bubble short

//creating the array
int arr[]={1,5,4,9,6};
int temp;
System.out.println("the current array");


for(int i=0; i < arr.length ; i++){
for(int j=0; j < arr.length-1-i ;j++){

if(arr[j]>arr[j+1])
{
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}


System.out.println("Array after bubble sort");
for(int i=0;i<arr.length;i++){

System.out.println(arr[i]);

}






}


}
