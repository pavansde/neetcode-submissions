class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> letters = new HashSet<>();
        int left=0,res=0;
        for(int r=0;r<s.length();r++)
        {
            while(letters.contains(s.charAt(r)))
            {
                letters.remove(s.charAt(left));
                left++;
            }
            letters.add(s.charAt(r));
            res = Math.max(res, r-left+1);
        }
        
        return res;
    }
}
