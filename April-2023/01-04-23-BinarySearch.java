//https://leetcode.com/problems/binary-search/description/
class Solution {
    public int search(int[] nums, int target) {
        int l=0, r = nums.length-1;
        while(l <= r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target)return mid;
            if(nums[mid]>target)r=mid-1;
            if(nums[mid]<target)l=mid+1;
        }
        return -1;
        //return searchRec(nums,target,l,r);
    }
    
    public int searchRec(int[] nums, int target, int l,int r){
        if(r >= l){
        int mid = l+ (r-l)/2;
        if(nums[mid] > target)
            return searchRec(nums,target,l,mid-1);
        else if(nums[mid] < target)
            return searchRec(nums,target,mid+1,r);
        else 
            return mid;
        }
        return -1;
        
    }
}
