class delete_arry{
public static void main(String arg[]){

System.out.println("create arry");

int arr[]={3,8,5,3,6,2};

 System.out.println("printing the array");
for(int i=0;i<arr.length;i++){

System.out.println(arr[i]);

}

int element=8;
int flag=0;

for(int i=0;i<arr.length;i++){
if(arr[i]==element){
flag=1;
break;

}

}
if(flag=1){
for(int i=1;i<arr.length;i++){

arr[i]=arr[i+1];


}
i--;

}

elseif(flag=0){

System.out.println("element is not found");

}

else{
System.out.println("invalid input");

}




}

}
