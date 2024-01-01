class Solution {
    fun isValid(s: String): Boolean {
        var openC = mutableListOf<Int>()
        val closeC = mutableListOf<Int>()
        var status = "fechar"

        for (i in s) {
            when (i) {
                '(' -> {
                    openC.add(1)

                }
                '[' ->{
                    openC.add(2)
                }
                '{' -> {
                    openC.add(3)
                }
                ')' -> {
                    closeC.add(1)
                    status = "fechar"

                }
                ']' -> {
                    closeC.add(2)
                    status = "fechar"

                }
                '}' -> {
                    closeC.add(3)
                    status = "fechar"

                }

            }
            if(closeC.isNotEmpty() && openC.isEmpty()){
                return false

            } else if(closeC.isNotEmpty() && openC.isNotEmpty() && status == "fechar"){
                if(openC.last() == closeC.first()){
                    openC.removeLast()
                    closeC.removeFirst()
                    status = "open"

                } else{
                    return false

                }

            }

        }

        if(closeC == openC){
            return true

        } else{
            return false

        }

    }
}

fun main(){
    val string: String = readln().replace("\"","")

    println (Solution().isValid(string))

}
