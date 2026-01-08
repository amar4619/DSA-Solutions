package Java.LinkedList;

public class FindtheDuplicateNumber {
    // Total sum 
    public int findDuplicate(int[] nums) {
        
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;++i){
        //     if(nums[i] == nums[i+1]){
        //         return nums[i];
        //     }
        // }

        //Solving it by tortoise and hare method

        int slow = nums[nums[0]];
        int fast = nums[slow];

        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        

        //Finding the entry point
        slow=nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;

        //Below was the original attempt 
        // int len = nums.length-1;
        // int sum = (len * (len + 1))/2;
        // int sum1 = Arrays.stream(nums).sum();
        // return sum1 - sum;
        
    }
}
