package 애너그램만들기

import java.util.*

private fun getAlphabetCount(str: String): IntArray {
    val count = IntArray(26)
    for (i in 0 until str.length) {
        count[str[i] - 'a']++
    }
    return count
}

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.next()
    val b = sc.next()

    val countA = getAlphabetCount(a)
    val countB = getAlphabetCount(b)

    var ans = 0
    for (i in 0 until 26) {
        ans += Math.abs(countA[i] - countB[i])
    }
    println(ans)
}