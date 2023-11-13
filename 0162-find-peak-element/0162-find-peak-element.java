class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length -1;
        if(high==0){
            return 0;
        }
        while(low <= high){
            int mid = low +(high-low)/2;
            int left = (mid-1)>=0 ? nums[mid -1] : Integer.MIN_VALUE;
            int right= (mid+1)<=high? nums[mid+1] : Integer.MIN_VALUE;
            
            if(nums[mid]>left && nums[mid]>right){
                return mid ;
            }
            else if(nums[mid]<left){
                high = mid -1;
            }
            else {
                low = mid +1;
            }
        }
        return -1;
    }
}