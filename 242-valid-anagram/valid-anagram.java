class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        // Method 1:- Easy Method(Brute Force)
        // char []arr1 = s.toCharArray();
        // char []arr2 = t.toCharArray();

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // return Arrays.equals(arr1,arr2);

        // Method 2:- Using Frequency Table
        int [] frequencyTable = new int [256];
        for(int i=0;i<s.length();i++)
        {
            frequencyTable[s.charAt(i)]++;
            frequencyTable[t.charAt(i)]--;
        }

        for(int i=0;i<256;i++)
        {
            if(frequencyTable[i] != 0)
            {
                return false;
            }
        }
        return true;
    }
}