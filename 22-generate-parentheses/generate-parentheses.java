class Solution {
   static void findAll(String current,int open,int close,ArrayList<String> result,int n)
   {

       // Base Case
       if(current.length() == 2*n)
       {
           result.add(current);
           return;
       }

       if(open<n)
       {
           findAll(current+"(",open+1,close,result,n);
       }

       if(open>close)
       {
           findAll(current+")",open,close+1,result,n);
       }
   }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        
        

        // Initially, all Perfect Parentesis will start from (
        // Since, I have already used one opening bracket,therefore I will pass 
        // value of opening brackets by decrementing it's value by 1
        //Here 1,means I have used 1 opening parentesis
        // 0,means I have not used any closing parentesis yet
        findAll("(",1,0,result,n);
        return result;

    }
}