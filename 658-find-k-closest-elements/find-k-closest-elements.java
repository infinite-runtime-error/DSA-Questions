class Solution {
    // static int lowerBound(int []arr,int x)
    // {
    //     int start=0;
    //     int end=arr.length-1;
    //     int mid=start+(end-start)/2;
    //     int ans=end;
    //     while(start<=end)
    //     {
    //         if(arr[mid]==x)
    //         {
    //             ans=mid;
    //             start=mid+1;
    //         }
    //         else if(arr[mid]<x)
    //         {
    //             start=mid+1;
    //         }
    //         else
    //         {
    //             end=mid-1;
    //         }
    //         mid=start+(end-start)/2;
    //     }
    //     return ans;
    // }
    
    // static int binarySearch(int []arr,int k,int x,int lowerBound)
    // {
    //  List<Integer> ans = new ArrayList<Integer>();
    // int high=lowerBound;
    // int low=high-1;
    // for(int i=k;i>=0;k--)
    // {
    //     if(low<0)
    //     {
    //         high++;
    //     }
    //     else if(high>=arr.length)
    //     {
    //         low--;
    //     }
    //     else if(Math.abs(x-arr[low])>Math.abs(arr[high]-x))
    //     {
    //         high++;
    //     }
    //     else
    //     {
    //         low--;
    //     }
    // }
    // for(int i=0;i<k;i++)
    // {
    //     ans.add(arr[i]);
    // }
    // return ans;
    // }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

    // 2 Pointer Approach
        int low=0;
        int high=arr.length-1;
        while(high-low>=k)
        {
            if(Math.abs(x-arr[low])>Math.abs(arr[high]-x))
            {
                low++;
            }
            else
            {
                high--;
            }
        }
       
       List<Integer> ans = new ArrayList<>(k);
        for(int i=low;i<=high;i++)
    {
        ans.add(arr[i]);
    }
    return ans;

    // Binary Search Approach
    // int lowerBound = Solution.lowerBound(arr,x);
    // return 0;

    // I didn't understood Binary Search Method to be Honest
    // But if u want to ahve a look at it's solution , then I am pasting it from editorial 
// class Solution {

    // Approach:
    // Using binary search and a sliding window, find the midpoint where,
    // the integers between midpoint and midpoint + k is the k closest integers to x.





//     public List<Integer> findClosestElements(int[] arr, int k, int x) {

//         // The sliding window is between 'mid' and 'mid' + k.
//         int left = 0, right = arr.length - k;
//         while (left < right) {
//             int midpoint = left + (right - left) / 2; // same as (left + right) / 2

//             // With midpoint on the left, we use x - arr[midpoint], while arr[midpoint + k] - x because it is on the right.
//             // This is important!
//             // Rather than using Math.abs(), we need the direction keep the x within the sliding window.
//             // If the window is too far left, we shift the window to the right.
//             if (x - arr[midpoint] > arr[midpoint + k] - x) {
//                 left = midpoint + 1;
//             }
//             // If the window is too far right, we shift the window to the left.
//             else {
//                 right = midpoint;
//             }
//         }

//         // Input all the k closest integers into the result.
//         List<Integer> result = new ArrayList<>(k);
//         for (int i = left; i < left + k; i++) {
//             result.add(arr[i]);
//         }
//         return result;
//     }
// }



    }
}