class Solution {
    public String removeDuplicates(String s) {
        // Creating A StringBuilder , because it is only mutable String in Java
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = 1;
        while(j<sb.length())
        {
            if(sb.charAt(i)==sb.charAt(j))
            {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);

                if(i!=0)
                {
                    i--;
                }
                if(j!=1)
                {
                    j--;
                }

            }
            else 
            {
                i++;
                j++;
            }
        }
        return sb.toString();
    }
}