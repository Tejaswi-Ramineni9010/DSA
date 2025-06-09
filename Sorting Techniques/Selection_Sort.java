class   Selection_Sort{
    static void selection_sort(int[] arr,int n){
        for(int i=0;i<=n-2;i++){
            int mini=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }

            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        


        }
        System.out.println("After Sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
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
        System.err.println();
        selection_sort(arr,n);
    }
}