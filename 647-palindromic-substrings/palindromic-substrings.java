class Solution {
    static int expandAroundIndex(String s,int i,int j)
    {
        int count = 0;
        while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j))
        {
            count++;
            i--;
            j++;
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