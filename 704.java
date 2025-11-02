class Solution {
    public int search(int[] nums, int target) {
        int beg=0;
        int end=nums.length-1;
        return binary(nums,beg,end,target);
    }
    public int binary(int[] arr,int beg,int end,int t){
        int mid=(beg+end)/2;
        if(beg>end){
            return -1;
        }
        if(arr[mid]==t){
            return mid;
        }else if(t>arr[mid]){
            return binary(arr,mid+1,end,t);
        }else{
            return binary(arr,beg,mid-1,t);
        }
    }
}
