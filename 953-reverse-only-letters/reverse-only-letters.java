class Solution {
    public String reverseOnlyLetters(String s) {
      
        // 2 Pointer Approach
        char [] arr = s.toCharArray();
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            if(!Character.isLetter(arr[start]))
            {
                start++;
            }
            else if(!Character.isLetter(arr[end]))
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

// TC: O(n), SC: O(n)