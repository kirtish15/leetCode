class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> num_map = new HashMap<>();

       for(int i = 0; i< nums.length; i++){
           int sum = target-nums[i];
           if(num_map.containsKey(sum)) {
               return new int [] {num_map.get(sum), i};
           }
           num_map.put(nums[i], i);
       }
       throw new IllegalArgumentException("no match found ");
    }
}