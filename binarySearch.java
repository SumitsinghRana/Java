import java.util.*;
public class binarySearch {
    public static int Search (int[]arr,int low,int high,int target){
        
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid]==target){
            System.out.println(mid);
            return mid;
        }
        else if(target>arr[mid]){
            return Search(arr,mid+1,high,target);
        }
        else{
            return Search(arr,low,mid-1,target);
        }
        

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int []arr={22,23,24,25,26,27,28,29,30};
        System.out.println("Element to search?");
        int target=s.nextInt();
        int low=0;
        int high=arr.length;
        Search(arr,low,high,target);
        s.close();
    }
}
