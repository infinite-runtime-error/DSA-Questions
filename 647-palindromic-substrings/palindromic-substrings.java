class Solution {
   static int expandAroundIndex(String s,int start,int end)
   {
       int count = 0;
       while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end))
       {
           count++;
           start--;
           end++;
       }
       return count;
   }
    public int countSubstrings(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            int oddKaAns = expandAroundIndex(s,i,i);
            count += oddKaAns;

            int evenKaAns = expandAroundIndex(s,i,i+1);
            count += evenKaAns;
        }
        return count;
    }
}