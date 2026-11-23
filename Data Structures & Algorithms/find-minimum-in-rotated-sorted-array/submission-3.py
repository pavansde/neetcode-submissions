class Solution:
    def findMin(self, nums: List[int]) -> int:
        res = nums[0]
        l, r = 0, len(nums)-1

        while l < r:
            if (nums[l]<nums[r]) and nums[l] < res:
                res = nums[l]
                l+=1
            elif (nums[r]<nums[l]) and nums[r] < res:
                res = nums[r]
                r-=1
            else:
                mid = (l+r)//2
                if(nums[l]<nums[mid]):
                    l = mid+1
                else:
                    r = mid-1
        return res   