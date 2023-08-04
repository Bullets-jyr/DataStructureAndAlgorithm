package 소금폭탄

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val current = sc.next()
    val drop = sc.next()

    val currentUnit = current.split(":")
    val currentHour = currentUnit[0].toInt()
    val currentMinute = currentUnit[1].toInt()
    val currentSecond = currentUnit[2].toInt()
    val currentSecondAmount = currentHour * 3600 + currentMinute * 60 + currentSecond

    val dropUnit = drop.split(":")
    val dropHour = dropUnit[0].toInt()
    val dropMinute = dropUnit[1].toInt()
    val dropSecond = dropUnit[2].toInt()
    val dropSecondAmount = dropHour * 3600 + dropMinute * 60 + dropSecond

    var needSecondAmount = dropSecondAmount - currentSecondAmount
    if (needSecondAmount <= 0) {
        needSecondAmount += 24 * 3600
    }

    val needHour = needSecondAmount / 3600
    val needMinute = (needSecondAmount % 3600) / 60
    val needSecond = needSecondAmount % 60

    val result = "%02d:%02d:%02d".format(needHour, needMinute, needSecond)
    println(result)
}