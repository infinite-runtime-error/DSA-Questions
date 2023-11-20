class Solution {
    public int climbStairs(int n) {

        // We will solve this question again
        // because it has high time complexity,so it exceeds time limit 
        // By the way,this code is correct
        // // Base Condition
        // if(n==0 || n==1)
        // {
        //     return 1;
        // }
        // // Recursion Condition
        // int ans = climbStairs(n-1) + climbStairs(n-2);
        // return ans;

        // This is code is only written to submit answer
         if(n==1) return 1;
        
        if(n==2) return 2;

        int[] a =  new int[n];
        a[0]=1;
        a[1]=2;

        for(int i=2;i<n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n-1]; 
    }
}