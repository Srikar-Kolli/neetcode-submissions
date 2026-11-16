class Solution:
    def maxProfit(self, prices: List[int]) -> int:


        left = 0
        right = 1
        max = 0
        current_price = 0

        while right < len(prices):
            if prices[right] > prices[left]:
                current_price = prices[right] - prices[left]
                if (current_price > max):
                    max = current_price

            elif (prices[right] < prices[left]):
                left = right

            right += 1
            
        
        if max == 0:
            return max

        
        return max
                

        