import java.util.*;
class Main{
    public static void main(String args[]){
        int arr[] = {3,5,3,2,1};
        int first = 0;
        int last = arr.length-1;
        while(first<last){
              int temp = arr[first] ; 
              arr[first] = arr[last];
              arr[last] = temp;
              first++;
              last--;
        }
        System.out.print(Arrays.toString(arr));
    }
}