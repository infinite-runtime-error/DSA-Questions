class Solution {
    static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        {
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        char []arr = s.toCharArray();
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            if(!isVowel(arr[start]))
            {
                start++;
            }
            else if(!isVowel(arr[end]))
            {
                end--;
            }
            else
            {
                // Swap
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(arr);
    }
}