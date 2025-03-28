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
    assertEquals(7, countVowels("Education is key"))

    // Test sumOfDigits
    assertEquals(10, sumOfDigits(1234))
    assertEquals(30, sumOfDigits(9876))
    assertEquals(6, sumOfDigits(123))

    // Test longestWord
    assertEquals("awesome", longestWord("Kotlin is awesome"))
    assertEquals("golfing", longestWord("I love code golfing"))
    assertEquals("Education", longestWord("Education is the key to success"))
    
    println("All tests passed!")
}
