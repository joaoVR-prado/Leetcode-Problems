class Solution {
    fun isPalindrome(x: Int): Boolean {
        val intToString: String = x.toString()
        return intToString.reversed() == intToString
      
    }

}

fun main(){
    val num = readln().toInt()
    println (Solution().isPalindrome(num))

}
