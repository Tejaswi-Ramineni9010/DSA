public class Second_Largest_Element {
    public static int secondLargestElement(int[] arr){
        int n=arr.length;
        int max=0;
        int second_max=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j]!=max){
                if(arr[j]>second_max){
                    second_max=arr[j];
                }
            }
        }
        return second_max;

    }
    public static void main(String[] args) {
        int[] arr={2,4,1,6,8,3,9,0};
        int second_largest=secondLargestElement(arr);
        System.out.println("second largest element is:"+second_largest);
    }
    
    
}
