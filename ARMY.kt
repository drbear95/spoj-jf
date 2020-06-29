import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    BufferedReader(InputStreamReader(System.`in`))
        .readLines().asSequence().drop(1).chunked(4).map {
            it.filter { record -> record.isNotEmpty() }.drop(1)
        }
        .map { armies ->
            val strOne = armies[0].split(" ").map(String::toInt).max() ?: 0
            val strTwo = armies[1].split(" ").map(String::toInt).max() ?: 0
            when {
                strOne > strTwo -> "Godzilla"
                strOne < strTwo -> "MechaGodzilla"
                else -> "Godzilla"
            }
        }.toList().run {
            println(joinToString("\n"))
        }
}