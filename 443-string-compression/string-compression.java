class Solution {
    public int compress(char[] chars) {
        int k = 0;
        int i = 0;
        while(i<chars.length)
        {
            int j = i;
            while(j<chars.length && chars[i] == chars[j])
            {
                j++;
            }
            chars[k] = chars[i];
            k++;

            int len = j-i;
            if(len>1)
            {
                String s = String.valueOf(len);
                for(char digit : s.toCharArray())
                {
                chars[k] = digit;
                k++;
                }
            }
            

            i = j;
        }
        
        return k;
    }
}