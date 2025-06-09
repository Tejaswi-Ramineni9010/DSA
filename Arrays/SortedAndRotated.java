//leetcode prblm num:1752
public class SortedAndRotated {
    public static boolean check(int[] arr){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){

                count+=1;
            }
        }
        if(count>1){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={7,8,9,1,2,3,4,5,6};
        boolean result = check(arr);
        System.out.println("Is Sorted and Rotated: " + result);
    }
    
}
