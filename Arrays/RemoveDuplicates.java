public class RemoveDuplicates {
    static int removeDuplicates(int[] arr,int n){
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i] !=arr[j]){
                arr[i+1]=arr[j];//copying is done no need to swap it
                i++;

            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4};
        int n = arr.length;
        int newLength = removeDuplicates(arr, n);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
