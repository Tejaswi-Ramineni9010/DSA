public class Insertion_Sort {
    static void insertion_sort(int[] arr,int n){
        for(int i=0;i<=n-1;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }

            }
            System.out.println("After Sorting:");
            for(int k=0;k<n;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();


        }
    public static void main(String[] args) {
        int arr[]={3,5,1,7,9,4,2};
        int n=arr.length;
        System.out.println("Before Sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        insertion_sort(arr,n);
    }
}

    
