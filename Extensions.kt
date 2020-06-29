import java.io.BufferedReader

fun BufferedReader.readExactLines(): List<String> {
    val result = arrayListOf<String>()
    val number = this.readLine().toInt()

    for (value in 0 until number) {
        result.add(readLine())
    }

    return result
}