/* Input :  5
            4 2 3 5 7
   Output : 2 4 7
*/

import java.util.*;

public class Hello{
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    //Accept input
    int N=sc.nextInt();
    int arr[]=new int [N];
    int i;
    for(i=0;i<N;i++){
      arr[i]=sc.nextInt();
    }
    printValues(arr,N);
}
  private static void printValues(int[] arr,int N){
    int i,j,t;
    for(i=0;i<N;i++){
      for(j=i+1;j<N;j++){
        if(arr[i]>arr[j]){
          t=arr[i];
          arr[i]=arr[j];
          arr[j]=t;
        }
      }
    }
    for(i=0;i<N;i++){
      if(i%2==0)
      System.out.print(arr[i]+" ");
    }
  }
}
