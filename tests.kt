// tests.kt - Unit tests for the functions
import kotlin.test.assertEquals

fun main() {
    // Test factorial
    assertEquals(120, factorial(5))
    assertEquals(5040, factorial(7))
    assertEquals(1, factorial(1))

    // Test countVowels
    assertEquals(3, countVowels("Hello World"))
    assertEquals(4, countVowels("Kotlin is fun!"))
    assertEquals(5, countVowels("Education is key"))
    
    println("All tests passed!")
}
