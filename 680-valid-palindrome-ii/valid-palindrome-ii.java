class Solution {
   static boolean checkPalindrome(String s)
   {
       int start = 0;
       int end = s.length()-1;

       while(start<=end)
       {
           if(s.charAt(start) != s.charAt(end))
           {
               return false;
           }

           start++;
           end--;
       }
       return true;
   }

   public boolean validPalindrome(String s) {
    int start = 0;
    int end = s.length()-1;

    while(start<=end)
    {

        if(s.charAt(start)!= s.charAt(end))
        {
            return checkPalindrome(s.substring(start+1,end+1)) || checkPalindrome(s.substring(start,end)) ;
        }

            System.out.println("hi");

        start++;
        end--;
    }
    return true;
    }
}