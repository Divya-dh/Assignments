print "Enter a number: "
def num = System.console().readLine() as Integer
def isPrime = true
if (num <= 1) isPrime = false
else {
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            isPrime = false
            break
        }
    }
}
println "$isPrime"
