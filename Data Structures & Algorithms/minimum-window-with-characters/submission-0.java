class Solution {
    public String minWindow(String s, String t) {
        int l=0,r=0,count=0,startIndex=-1,minLen=Integer.MAX_VALUE;
        int n=s.length(), m=t.length();
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<m;i++) mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)+1);
        while(r<n)
        {
            if(mp.containsKey(s.charAt(r)) && mp.get(s.charAt(r))>0) count++;
            mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)-1);

            while(count==m)
            {
                if(r-l+1<minLen)
                {
                    minLen = r-l+1;
                    startIndex=l;
                }
                mp.put(s.charAt(l),mp.getOrDefault(s.charAt(l),0)+1);
                if(mp.get(s.charAt(l))>0)
                {
                    count--;
                }
                l++;
            }
            r++;
        }
        return startIndex == -1 ? "" : s.substring(startIndex,startIndex+minLen);
    }
}
