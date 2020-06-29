import java.io.BufferedReader
import java.io.InputStreamReader
import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun main() {
    BufferedReader(InputStreamReader(System.`in`))
        .readLines()
        .map {
            it.split(" ")
        }.map { entry ->
            entry.let { particle ->
                val start =
                    LocalTime.parse(particle[0], DateTimeFormatter.ofPattern("HH:mm:ss")).toSecondOfDay().toDouble()
                val end =
                    LocalTime.parse(particle[1], DateTimeFormatter.ofPattern("HH:mm:ss")).toSecondOfDay().toDouble()
                val period = (end - start) / 3600.toDouble()
                val lengthKm = particle[2].toDouble() / 1000
                val lengthMiles = particle[2].toDouble() / 1852

                "${"%.1f".format(calcSpeed(period, lengthKm))} ${"%.1f".format(calcSpeed(period, lengthMiles))}"
            }
        }.run {
            println(joinToString("\n"))
        }
}

fun calcSpeed(time: Double, length: Double): Double {
    return length / time
}

