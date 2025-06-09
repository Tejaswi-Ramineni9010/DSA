public class RotateArray {
    public void rotateArray(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
     public static void main(String[] args) {
        RotateArray rotator = new RotateArray();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotator.rotateArray(arr, k);

        System.out.println("Array after rotating to the right by " + k + " positions:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
