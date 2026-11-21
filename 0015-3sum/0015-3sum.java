class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
                    Arrays.sort(nums);
                            List<List<Integer>> result = new LinkedList<>();
        int n=nums.length;
        int left,right;
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            left=i+1;
            right=n-1;
            int sum=-1*nums[i];
        
        while(left<right){
            int s=nums[left]+nums[right];
            if(s==sum){
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                right--;
            
            while(left<n && nums[left]==nums[left-1]){
                left++;
            }
            while(right>=0 && nums[right]==nums[right+1]){
                right--;
            }
            }
            else if(s<sum){
                left++;
            }
            else{
                right--;
            }
        }
        }
        return result;
    }
}