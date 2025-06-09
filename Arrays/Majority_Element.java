public class Majority_Element {
    public int majorityElement(int[] nums) {
        int maj_element = 0;
        int count = 0;

        // Moore's Voting Phase
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                maj_element = nums[i];
            }

            if (nums[i] == maj_element) {
                count++;
            } else {
                count--;
            }
        }

        
        count = 0;
        for (int num : nums) {
            if (num == maj_element) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return maj_element;
        }
        return -1; 
    }

    public static void main(String[] args) {
        Majority_Element obj = new Majority_Element();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + obj.majorityElement(nums));
    }
}
