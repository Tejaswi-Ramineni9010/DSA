//53.maximum subarray
public class Maximun_Subarray {
    public static int maxSubarray(int[] nums){
        int max_current=nums[0];
        int max_global=nums[0];
        for(int i=1;i<nums.length;i++){
            max_current=Math.max(nums[i],max_current+nums[i]);
            if(max_current>max_global){
                max_global=max_current;
            }
        }
        return max_global;
        
    }
    public static void main(String[] args) {
       
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubarray(nums));
    }

    

    
}
