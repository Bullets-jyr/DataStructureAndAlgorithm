package 개미

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val W = sc.nextInt()
    val H = sc.nextInt()
    val P = sc.nextInt()
    val Q = sc.nextInt()
    val T = sc.nextInt()

    var currentX = (T + P) % (2 * W)
    var currentY = (T + Q) % (2 * H)
    if (currentX > W) {
        currentX = 2 * W - currentX
    }
    if (currentY > H) {
        currentY = 2 * H - currentY
    }

    println("$currentX $currentY")
}