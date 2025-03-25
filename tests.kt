// tests.kt - Unit tests for the functions
import kotlin.test.assertEquals

fun main() {
    // Test factorial
    assertEquals(120, factorial(5))
    assertEquals(5040, factorial(7))
    assertEquals(1, factorial(1))
    
    println("All tests passed!")
}
