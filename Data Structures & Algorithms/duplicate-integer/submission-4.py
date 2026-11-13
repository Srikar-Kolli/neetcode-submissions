class Solution:
    def hasDuplicate(self, nums):
        empty = set()

        for i in nums:
            if i in empty:
                return True;

            empty.add(i)
        
        return False

        
        