class Solution {
    public int findMinDifference(List<String> timePoints) {
        // Step 1:-
        int []arr = new int [timePoints.size()];

        // Step 2:-
        for(int i=0;i<timePoints.size();i++)
        {
            String current = timePoints.get(i);
            int hours = Integer.parseInt(current.substring(0,2));
            int minutes = Integer.parseInt(current.substring(3,5));
            int totalMinutes = ( hours * 60 )+minutes;
            arr[i] = totalMinutes;
        }

        // Step 3:-
        Arrays.sort(arr);

        // Step 4:- 
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            int miniDifference = arr[i+1]-arr[i];
            mini = Math.min(mini,miniDifference);
        }

        int lastDifference = (arr[0]+1440) - (arr[arr.length-1]);
        mini = Math.min(mini,lastDifference);

        return mini;
    }
}