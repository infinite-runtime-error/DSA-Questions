class Solution {
    static int peakIndex(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end)/2;
        while(start<end)
        {
            if(arr[mid]<arr[mid+1])
            {
                start = mid+1;
            }
            else
            {
                end = mid;
            }
            mid = (start + end)/2;
        }
        return mid;
    }
    public int peakIndexInMountainArray(int[] arr) {
        return peakIndex(arr);
    }
}