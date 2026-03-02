class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min_diff = Integer.MAX_VALUE;
        int min_sum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(target - sum);
                if (diff < min_diff) {
                    min_diff = diff;
                    min_sum = sum;
                }

                if(sum<target)
                left++;
                else
                right--;

            }
        }
        return min_sum;
    }
}
