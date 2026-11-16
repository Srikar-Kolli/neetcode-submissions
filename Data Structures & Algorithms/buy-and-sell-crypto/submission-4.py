class Solution:
    def maxProfit(self, prices: List[int]) -> int:


        left = 0
        right = 1
        max_profit = 0
        current_profit = 0

        while right < len(prices):
            if prices[right] > prices[left]:
                current_profit = prices[right] - prices[left]
                if (current_profit > max_profit):
                    max_profit = current_profit

            elif (prices[right] < prices[left]):
                left = right

            right += 1

        
        return max_profit
                

        