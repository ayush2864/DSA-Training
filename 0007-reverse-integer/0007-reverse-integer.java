class Solution {
    public int reverse(int x) {
         int rem;
         long rev=0;
        while(x!=0)
        {
            rem=x%10;
            rev=rev*10+rem;
            if(rev > Integer.MAX_VALUE)return 0;
            if(rev < Integer.MIN_VALUE)return 0;
            x=x/10;
        }
        return (int)rev;
    } 
}
