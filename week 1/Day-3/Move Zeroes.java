class Solution {
    public void moveZeroes(int[] nums) {
        int dx=0;
          for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[dx]=nums[i];
            dx++;
         }
        
    }
    while(dx<nums.length){
        nums[dx]=0;
        dx++;
    }
    }
}
