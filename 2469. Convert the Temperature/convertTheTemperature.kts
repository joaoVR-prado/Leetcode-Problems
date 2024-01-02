class Solution {
    fun convertTemperature(celsius: Double): DoubleArray {
        return doubleArrayOf(celsius + 273.15, celsius * 1.80 + 32.00)
    }
}

fun main(){
    val celsius: Double = readln().toDouble()
    val (kelvin, fahrenheit) = Solution().convertTemperature(celsius)
    println("[$kelvin,$fahrenheit]")
}
