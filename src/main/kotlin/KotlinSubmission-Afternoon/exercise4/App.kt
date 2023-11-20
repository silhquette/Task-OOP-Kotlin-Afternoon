package id.infinitelearning.KotlinSubmission.exercise4

import java.lang.NumberFormatException

fun main() {
    println(divide(3,0))
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    fun divide(x: Int, y: Int): Any {
       return try {
           x/y
       } catch (e:Exception) {
           println(e)
           "Dilarang membagi bilangan dengan 0"
       }
    }