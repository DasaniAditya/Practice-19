class Solution {
    public int maxAbsoluteSum(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }   
        int sum=0,min=0,max=0;
        for(int i:nums)
        {
            sum += i;
            min = Math.min(min,sum);
            max = Math.max(max,sum);
            
        }
        return max-min;
    }
}

class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0) nums[i] = 0;
        }
        for(int i = 0; i < nums.length; i++){
            int num = Math.abs(nums[i]);
            if(num >= 1 && num <= nums.length){
                if(nums[num-1] == 0)  {
                    nums[num-1] = Integer.MIN_VALUE; 
                } else {
                    nums[num-1] = -1*Math.abs(nums[num-1]);
                }
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0) {
                return i+1;
            }
        }
        return nums.length+1;
    }
}