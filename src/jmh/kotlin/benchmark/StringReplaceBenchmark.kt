package benchmark

import org.openjdk.jmh.annotations.Benchmark


fun String.replaceCustom(oldValue: String, newValue: String, ignoreCase: Boolean = false): String {

    var i = indexOf(oldValue, ignoreCase = ignoreCase)
    if (i == -1) return this

    val buffer = StringBuffer(length)
    var tail = 0 // remaining after last substitution
    do {
        buffer.append(this, tail, i)
        buffer.append(newValue)
        tail = i + oldValue.length
        i = indexOf(oldValue, tail, ignoreCase)
    } while (i >= 0)

    buffer.append(this, tail, this.length)
    return buffer.toString()
}

open class StringReplaceBenchmark {

    @Benchmark
    fun testKotlinReplace() {

    }
}