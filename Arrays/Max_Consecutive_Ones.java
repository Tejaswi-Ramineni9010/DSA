//485.max consecutive ones
public class Max_Consecutive_Ones {
    public static int maxConsecutiveOnes(int[] nums){
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            if(max<count){
                max=count;
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1}; // Example input
        System.out.println("Max consecutive 1s: " + maxConsecutiveOnes(nums));
    }
    
}
