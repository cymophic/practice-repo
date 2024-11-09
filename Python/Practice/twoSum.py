class Solution:
    def twoSum(self, nums, target) -> list[int]:
        done = {}
        for index, num in enumerate(nums):
            diff = target - num
            print(f'{diff} = {target} - {num}')

            if diff in done:
                print(f'{num} is in done.')
                done[num] = index
                return [done[diff], index]
            
            print(f'{num} is not in done.')
            done[num] = index
            print(done, '\n')

nums = [10, 2, 5, 1, 3, 4]
target = 6

print(Solution().twoSum(nums, target))