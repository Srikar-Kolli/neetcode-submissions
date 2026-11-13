class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        counts = {}

        if len(s) != len(t):
            return False

        for ch in s:
            if ch in counts:
                counts[ch] += 1
            else:
                counts[ch] = 1

        for sc in t:
            if sc not in counts or counts[sc] == 0:
                return False
            
            counts[sc] -= 1

        return True 

        
        