class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i:nums)
        {
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int key: freq.keySet())
        {
            int frequency = freq.get(key);
            if(bucket[frequency]==null)
            {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        List<Integer> topK = new ArrayList<>();
        for(int pos=bucket.length-1;pos>=0 && topK.size()<k;pos--)
        {
            if(bucket[pos]!=null)
            {
                topK.addAll(bucket[pos]);
            }
        }
        return topK.stream().mapToInt(i->i).toArray();
    }
}
