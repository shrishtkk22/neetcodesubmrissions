class Solution {
    public int[] twoSum(int[] nums, int target) {

        int sum = 0;
        

        for(int i = 0; i<=nums.length-2;i++){

            for(int j = i+1;j<=nums.length-1;j++){
             
             if(nums[i]+nums[j]== target){
                 int[]ans=new int[]{i,j};
                 
                 return ans;
                
             }


            }
        }
      return null;  
    }
}
