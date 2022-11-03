class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 7};
        int target = 5;
        searchInsert(nums, target);
    }
    public int searchInsert(int[] nums, int target) {
       int l = 0;
       int h = nums.length;
        
       while(l <= h){
           int m = (l + h) / 2;
           
           if(nums[m] < target){
               l = m;
           }
           else if(nums[m] > target){
               h = m;
           }
           else{
               return m;
           }
       }
        return l;
    }
}