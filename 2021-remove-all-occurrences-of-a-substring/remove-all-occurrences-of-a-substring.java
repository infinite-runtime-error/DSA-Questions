class Solution {
    public String removeOccurrences(String s, String part) {
        // Using Recurion
        // Base Case 1
        // if(s.length()<part.length())
        // {
        //     return s;
        // }

        // // Base Case 2
        // int index = s.indexOf(part);
        // if(index == -1)
        // {
        //     return s;
        // }

        // StringBuilder sb = new StringBuilder(s);
        // int start = index;
        // int end = part.length()+start;
        // String leftPart = s.substring(0,start);
        // String rightPart = s.substring(end,s.length());
        // sb.append(leftPart);
        // sb.append(rightPart);
        // return removeOccurrences(sb.toString(),part);



        // Easy Solution
        while(s.contains(part))
        {
            int start = s.indexOf(part);
            int end = part.length()+start;
            s = s.substring(0,start)+s.substring(end,s.length());
        }
        return s;
    }
}