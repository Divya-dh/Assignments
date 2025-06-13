def divideNumbers(int a, int b) {
    try {
        def result = a / b
        println "$result"
    } catch (ArithmeticException e) {
        println "Caught ArithmeticException: Cannot divide by zero."
    } finally {
        println "Finished division operation."
    }
}
divideNumbers(10, 0)
def readFile(fileName) {
    try {
        def file = new File(fileName)
        println file.text
    } catch (FileNotFoundException e) {
        println "Caught FileNotFoundException: ${e.message}"
    } finally {
        println "Finished reading file."
    }
}
readFile("file.txt")
