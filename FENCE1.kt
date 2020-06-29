import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

fun main() {
    BufferedReader(InputStreamReader(System.`in`))
        .readLines()
        .dropLast(1)
        .run {
            println(joinToString(" ") { l -> "%.2f".format(((l.toDouble().pow(2)) / (2 * Math.PI))) })
        }
}