public class Largest_Element{
    public static int largest_element(int[] arr){
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        int largest=arr[0];
        for(int num:arr){
            if(largest<num){
                largest=num;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr={3,2,4,1,6,4,9,8};
        int largest=largest_element(arr);
        System.out.println("Largest Element is:"+largest);
    }
}