//1.two sum
public class TwoSum {
    public int[] twoSum(int[] nums,int k){
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==k){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    } 
     public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = ts.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
