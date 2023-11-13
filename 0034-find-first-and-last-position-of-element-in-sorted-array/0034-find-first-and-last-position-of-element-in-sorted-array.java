class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = firstoccur(nums,target);
        arr[1] = lastoccur(nums,target);
        return arr;
    }
    public static int firstoccur(int[] nums,int target){
        int first = -1;
        int low = 0; int high = nums.length -1;
        while(low <= high){
            int mid = low + (high -low)/2;
            if(nums[mid]==target){
                first = mid;
                high = mid -1;
            }
            else if(nums[mid]< target){
                low = mid +1 ;

            }
            else {
                high = mid -1 ;
            }

        }
        return first;
    }
     public static int lastoccur(int[] nums,int target){
        int last = -1;
        int low = 0; int high = nums.length -1;
        while(low <= high){
            int mid = low + (high -low)/2;
            if(nums[mid]==target){
                last = mid;
                low  = mid + 1;
            }
            else if(nums[mid]< target){
                low = mid +1 ;

            }
            else {
                high = mid -1 ;
            }

        }
        return last;
    }

}