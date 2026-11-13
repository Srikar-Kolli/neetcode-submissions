class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        map = {}

        for ch in s:
            if ch in map:
                map[ch] += 1
            else:
                map[ch] = 1

        for sc in t:
            if sc not in map or map[sc] == 0:
                return False
            
            map[sc] -= 1

        if len(s) != len(t):
            return False

        return True 

        
        