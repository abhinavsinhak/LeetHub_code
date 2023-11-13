class Solution {
    public int mySqrt(int x) {
        int left=1,right = x,mid; long q;
        while(left<=right){
            mid = left + (right - left)/2;
             q = (long)mid * mid;

            if(q==x){
                return mid;
            }
            else if(q<x){
                left = mid +1;

            }
            else {
                right = mid -1;
            }

        }
        return right;
    }
}