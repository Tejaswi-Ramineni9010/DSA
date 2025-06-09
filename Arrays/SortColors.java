//75.sort colors
public class SortColors {
    public static void sortColors(int[] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<high){
        for(int i=0;i<arr.length;i++){
            if(arr[mid]==0){
                swap with low;
                mid++;
                low++;
                
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap with high;
                mid++;
                high--;
            }
        }
    }
    }
    public static void main(String[] args) {
        int[] colors = {2, 0, 2, 1, 1, 0};
        sortColors(colors);

        System.out.print("Sorted colors: ");
        for (int color : colors) {
            System.out.print(color + " ");
        }
    }

    
}
