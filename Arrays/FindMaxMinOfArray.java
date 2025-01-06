import java.util.*;
class Main{
    public static void main(String args[]){
        int arr[] = {3,4,2,5,1};
        // Brute Force Approach
        int result[] = Brute(arr);
        System.out.println("Brute Force Approach: \nMax: "+result[0]+", Min: "+result[1]);  // Time Complexity:O(n)

        // Better approach

        int better[] = Better(arr);  // Time Complexity: O(nlogn)
        System.out.print("Better Approach: \nMax: "+better[0]+", Min: "+better[1]);
    }
    public static int[] Brute(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int ele:arr){
            if(max<ele){
                max=ele;
            }
            else if(min>ele){
                min = ele;
            }
        }

        return new int[]{max,min};
    }

    public static int[] Better(int[] arr){
        Arrays.sort(arr); // Sorting 
        int len = arr.length-1;
        return new int[]{arr[len],arr[0]};
    }
}