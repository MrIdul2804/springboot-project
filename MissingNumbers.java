import java.util.*;
public class MissingNumbers {
    public static void main(String[] args){
        int[] arr= new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<9;i++){
            arr[i]=sc.nextInt();
        }
          for(int i=0;i<8;i++){
              for(int j=i+1;j<9;j++){
                  if(arr[j]<arr[i]) {
                      arr[i] = arr[i] + arr[j];
                      arr[j] = arr[i] - arr[j];
                      arr[i] = arr[i] - arr[j];
                  }
              }
          }
          for(int i=0;i<10;){
              if(arr[i]==i+1){
                  i++;

              }
              else{
                  int a=i+1;
                  System.out.println("Missing element found at "+i+"th position"+" and missing no. is "+a);
                  break;
              }
          }

    }

}
