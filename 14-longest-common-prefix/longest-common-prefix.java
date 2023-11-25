class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Step 1:- Sorting Array
        // Reason for Sorting :- The reason why we sort the input
        //  array of strings
        //  and  compare the first and last strings is that the 
        // longest common prefix 
        //  of all the strings must be a prefix of the first
        // string and a prefix of 
        //  the last string in the sorted array. This is because 
        //strings are ordered
        //   based on their alphabetical order (Lexicographical order).
        // For example, consider the input array of strings 
        // {"flower", "flow","flight"} . After sorting the array, we get 
        // {"flight", "flow", "flower"}. The longest common prefix of 
        //all the strings
        //  is "fl", which is located at the beginning of the first 
        //string "flight" 
        //  and the second string "flow". Therefore, by comparing the
        // first and 
        //  last strings of the sorted array, we can easily find the longest 
        //  common prefix.

        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int index = 0;

        while(index<s1.length() && index<s2.length())
        {
            if(s1.charAt(index)==s2.charAt(index))
            {
                index++;
            }
            else
            {
                break;
            }
            
        }
        return s2.substring(0,index);
    }
}