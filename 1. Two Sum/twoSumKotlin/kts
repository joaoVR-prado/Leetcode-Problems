class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices){
            for (j in i + 1 until nums.size ){
                if(nums[i] + nums[j] == target){
                    return intArrayOf(i, j)

                }

            }

        }

        return intArrayOf()
    }
}

fun main(){

    var numsString = readLine().toString()
    val target = readLine()!!.toInt()
    val re = Regex("[^0-9,]")

    numsString = numsString.replace(re, "")

    val nums = numsString.split(",").map { it.toInt() }.toIntArray()

    val sumsIndex = Solution().twoSum(nums, target)
    sumsIndex.forEach { println(it) }

}
