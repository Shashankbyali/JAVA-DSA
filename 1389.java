class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int temp=target[index[i]];
            target[index[i]]=nums[i];
            target[index[i]+1]=temp;
            // target[index[i]]=nums[i];
        }
        return target;
    }
}
