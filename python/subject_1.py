class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hashmap = {}
        for index, num in enumerate(nums):
            print(hashmap)
            another_num = target - num
            if another_num in hashmap:
                return [hashmap[another_num], index]
            hashmap[num] = index


# a = Solution()
# b = a.twoSum([3,2,4], 6)
# c= a.twoSum([2, 7, 11, 15],9)
# print(b)
# print(c)
nums= [5,1,3,4,6,9]
target = 13
# d.sort()

def new_twoSum( nums, target):
    for i in range(len(nums)):
        print(nums[i])
        another_num = target - nums[i]
        if another_num in nums:
            if i!=nums.index(another_num):
                print([i, nums.index(another_num)])
                break

new_twoSum(nums,10)




