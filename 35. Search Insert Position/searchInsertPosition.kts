class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var index = 0
        var notOnArray = 0

        for(i in 0 until nums.size){
            if(target == nums[i]){
                index = i
                notOnArray = 1

            } else if(target < nums[i] && notOnArray == 0){
                index = i
                notOnArray = 1
                 
            } else if(i == nums.size - 1 && notOnArray == 0){
                index = i + 1
                notOnArray = 1
                
            }

        }
        
        return index

    }
}
