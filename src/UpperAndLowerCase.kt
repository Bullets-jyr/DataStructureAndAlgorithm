import java.util.*

fun main() {
    val sc: Scanner = Scanner(System.`in`)
    val str: String = sc.next()
    //        String ans = "";
    val ans = str.toCharArray()
    for (i in 0 until str.length) {
        val ch = str[i]
        if ('A' <= ch && ch <= 'Z') {
            ans[i] = ('a' + ch.code - 'A').toChar()
        } else {
            ans[i] = ('A' + ch.code - 'a').toChar()
        }
    }
    println(ans)
}