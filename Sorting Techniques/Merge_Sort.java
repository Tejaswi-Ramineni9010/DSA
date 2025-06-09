import java.util.ArrayList;
public class Merge_Sort {
    static void merge_sort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        merge_sort(arr, low, mid);
        merge_sort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }
    static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++)
        arr[i]=temp.get(i-low);
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7, 9, 4, 2};
        int n = arr.length;

        System.out.println("Before Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        merge_sort(arr, 0, n - 1);

        System.out.println("After Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
