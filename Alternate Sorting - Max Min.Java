/* Input :  7
            1 2 3 4 5 6 7
   Output : 7 1 6 2 5 3 4
*/

import java.util.Arrays;
import java.util.Scanner;

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
    alternateSort(arr,N);
    for(i=0;i<N;i++){
      System.out.print(arr[i]+" ");
    }
  }
  private static void alternateSort(int arr[],int LENGTH){
    int i,j,t;
    for(i=0;i<LENGTH;i++){
      for(j=i+1;j<LENGTH;j++){
        if(arr[i]<arr[j]){
          t=arr[i];
          arr[i]=arr[j];
          arr[j]=t;
        }
      }
    }
    int s=LENGTH,k=1;
    int a[]=new int[LENGTH];
    a[0]=arr[0];
    for(i=1;i<LENGTH;i++){
      if(i%2!=0){
        a[i]=arr[s-1];
        s--;
      }else{
        a[i]=arr[k];
        k++;
      }
    }
    for(i=0;i<LENGTH;i++){
      arr[i]=a[i];
    }
  }
}
    
