def calculate(a, b, operation) {
    operation(a, b)
}
def add = { x, y -> x + y }
def subtract = { x, y -> x - y }
def multiply = { x, y -> x * y }
def scanner = new Scanner(System.in)
print "Enter first number: "
int a = scanner.nextInt()
print "Enter second number: "
int b = scanner.nextInt()
println "Addition: ${calculate(a, b, add)}"
println "Subtraction: ${calculate(a, b, subtract)}"
println "Multiplication: ${calculate(a, b, multiply)}"
