class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # return Counter(s) == Counter(t)
        countS, countT = {}, {}
        if len(s) != len(t): return False
        for i in range(len(s)):
            countS[s[i]] = 1 + countS.get(s[i], 1)
            countT[t[i]] = 1 + countT.get(t[i], 1)
        return countS == countT