class Solution {
    fun countOdds(low: Int, high: Int): Int {
        var odd: Int = 0

        for(i in low until high+1){
            if(i %2 != 0){
                odd++

            }

        }

        return odd

    }
}
