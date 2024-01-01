class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        var firstPrefix = strs[0]

        for(i in 1 until strs.size){
            firstPrefix = firstPrefix.commonPrefixWith(strs[i])

            if(firstPrefix.isEmpty()) return ""

        }

        return firstPrefix

    }
}

fun main(){
    var string: String = readln()
    val regex = """\["(.*?)"]""".toRegex()
    val remove = regex.find(string ?: "")
    val stringToArray = remove?.groups?.get(1)?.value?.split("\",\"")?.toTypedArray() ?: emptyArray()

    println(Solution().longestCommonPrefix(stringToArray))

}
