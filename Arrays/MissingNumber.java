//268.missing number
public class MissingNumber {
    public int missingNumber(int[] nums){
        int n=nums.length;
        int sum=0;
        int sumOfNaturals=n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int missing_number=sumOfNaturals-sum;
        return missing_number;
    }
  public static void main(String[] args) {
        MissingNumber obj = new MissingNumber();
        int[] nums = {3, 0, 1}; // Example input
        int result = obj.missingNumber(nums);
        System.out.println("Missing number is: " + result);
    }
    
}
