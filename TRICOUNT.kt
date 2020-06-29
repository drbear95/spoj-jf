import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    BufferedReader(InputStreamReader(System.`in`))
        .readExactLines()
        .forEach {
            println(calculate(it.toLong()))
        }
}

fun calculate(n: Long): Long {
    return (n * (n + 2) * (2 * n + 1)) / 8
}