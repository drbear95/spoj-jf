import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    BufferedReader(InputStreamReader(System.`in`))
        .readLines()
        .let { input ->
            input[1].split(" ") to input[2]
        }.let { (repetitions, word) ->
            word.map { char ->
                repetitions.any { repetition -> repetition == char.toString() }
                    .let { isExists ->
                        when (isExists) {
                            true -> char.toString().repeat(2)
                            else -> char.toString()
                        }
                    }
            }
        }.also {
            println(it.joinToString(separator = ""))
        }
}