import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    BufferedReader(InputStreamReader(System.`in`))
        .readLines()
        .map {
            Regex("<.+?>").replace(it){matchResult ->
                matchResult.value.toUpperCase()
            }
        }.run {
            println(joinToString("\n"))
        }
}