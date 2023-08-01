package 단어공부

import java.util.Scanner

private fun getAlphabetCount(str: String): IntArray {
    val count = IntArray(26)
    for (i in 0 until str.length) {
        val ch = str[i]
        if ('A' <= ch && ch <= 'Z') {
            count[ch - 'A']++
        } else {
            count[ch - 'a']++
        }
    }
    return count
}
fun main() {
    val sc = Scanner(System.`in`)
    val str = sc.next()

    val count = getAlphabetCount(str)

    var maxCount = -1
    var maxAlphabet = '?';

    for (i in 0 until 26) {
        if (count[i] > maxCount) {
            maxCount = count[i]
            maxAlphabet = ('A' + i).toChar()
        } else if (count[i] == maxCount) {
            maxAlphabet = '?'
        }
    }
    println(maxAlphabet)
}