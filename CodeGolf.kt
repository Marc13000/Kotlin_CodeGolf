fun factorial(n: Int): Int {
    if (n == 0 || n == 1) {
        return 1
    }
    return n * factorial(n - 1)
}

fun countVowels(s: String): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    
    var count = 0
    
    for (char in s) {
        if (char in vowels) {
            count++
        }
    }
    return count
}
