class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int start = 0;
        int end = n-1;
        while(start<end){
            int mid = start + (end-start)/2;
            int mid_val = mountainArr.get(mid);
            int nextval = mountainArr.get(mid+1);
            if(mid_val < nextval){
                start = mid+1;
            }
            else{
            end = mid;
            }
        }
        int peak = start;
        int result = binarysearch(mountainArr,0,peak,target,true);
        if(result!=-1){
            return result;
        }
        return binarysearch(mountainArr,peak+1,n-1,target,false);
    }
    public int binarysearch(MountainArray arr, int start, int end, int target, boolean ascending){
        while(start<=end){
            int mid = start + (end-start)/2;
            int midval = arr.get(mid);
            if(midval == target){
                return mid;
            }
            if(ascending){
                if(target<midval){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target<midval){
                   start = mid+1;
                }
                else{
                    end = mid-1; 
                }
            }
        }
        return -1;
    }
}
