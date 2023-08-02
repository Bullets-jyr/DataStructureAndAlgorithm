package 문서검색

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val doc = sc.nextLine()
    val word = sc.nextLine()

    var count = 0
    var startIndex = 0;
    while (true) {
        var findIndex = doc.indexOf(word, startIndex)
        if (findIndex < 0) {
            break
        }
        count++
        startIndex = findIndex + word.length
    }
    println(count)
}