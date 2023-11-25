
class Solution {
  public int myAtoi(String s) {
      // Strip() method is used for strings in java,it deletes whitespaces
      // from starting and ending

      s = s.strip();
      if(s.length()==0)
      {
          return 0;
      }


        int sign = s.charAt(0) == '-'?-1:1;
        if(s.charAt(0) == '-' || s.charAt(0) == '+')
        {
            s = s.substring(1);
        }
        long num = 0;
        for(char c:s.toCharArray())
        {
            if(!Character.isDigit(c))
            {
                break;
            }
            else
            {
                num = num * 10 + (c -'0');
            }
            if (sign * num <= Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

            if (sign * num >= Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        }

      return sign*(int)num;
  }
}