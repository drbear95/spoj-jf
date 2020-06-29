import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    BufferedReader(InputStreamReader(System.`in`))
        .readExactLines()
        .map {
            calc(it.toLong())
        }.run {
            println(joinToString("\n"))
        }
}

fun calc(n: Long): Long {
    return (n - 1) * 250 + 192
}