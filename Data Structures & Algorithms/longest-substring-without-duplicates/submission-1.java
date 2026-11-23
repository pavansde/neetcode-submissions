class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> letters = new HashSet<>();
        int l=0,r=0,n=s.length(),max=0;
        while(r<n)
        {
            if(letters.contains(s.charAt(r)))
            {
                letters.remove(s.charAt(l));
                l++;
            }
            else{
                letters.add(s.charAt(r));
                max=Math.max(max,r-l+1);
                r++;
            }
        }
        return max;
    }
}
