class Solution {
    public int findMinDifference(List<String> timePoints) {
        
       // Step 1:- Create an Empty Array
       int [] empty = new int [timePoints.size()];

       // Step 2:- Convert String into Int and store in arrays
       for(int i=0;i<timePoints.size();i++)
       {
           String currentString = timePoints.get(i);
           int hours = Integer.parseInt(currentString.substring(0,2));
           int minutes = Integer.parseInt(currentString.substring(3,5));
           int totalMinutes = (hours*60)+minutes;
           empty[i] = totalMinutes;
       }

       // Step 3:- Sort Array
       Arrays.sort(empty);

       // Step 4:- Find Minimum Difference between elements of empty array
       int mini = Integer.MAX_VALUE;
       for(int i=0;i<empty.length-1;i++)
       {
           int difference = empty[i+1]-empty[i];
           mini = Math.min(mini,difference);
       }

       // Step 5:- Find minimum element between mini and lastDifference
       int lastDifference = (empty[0]+1440)-empty[empty.length-1];
       mini = Math.min(mini,lastDifference);

       return mini;



    }
}