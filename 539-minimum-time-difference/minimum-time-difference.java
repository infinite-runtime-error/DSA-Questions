class Solution {
    public int findMinDifference(List<String> timePoints) {
        // Step 1:- Create an Empty Array of same size as of timePoints
        int []arr = new int[timePoints.size()];

        // Step 2:- Traverse String Array
        for(int i=0;i<timePoints.size();i++)
        {
            String current = timePoints.get(i);
            int hours = Integer.parseInt(current.substring(0,2));
            int minutes = Integer.parseInt(current.substring(3,5));
            int totalMinutes = hours*60 + minutes;
            arr[i] = totalMinutes;
        }

        // Step 3:- Sort Array
        Arrays.sort(arr);

        // Step 4:- Find Minimum Time Differnce Between all elements
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            int miniTime = arr[i+1]-arr[i];
            mini = Math.min(miniTime,mini);
        }

        // Step 5:- Comparing Last Minimum Difference
        int lastDifference = ((arr[0]+1440)-arr[arr.length-1]);
        mini = Math.min(mini,lastDifference);

        return mini;
    }
}