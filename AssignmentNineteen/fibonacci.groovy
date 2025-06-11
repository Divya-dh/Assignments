print "Enter number of terms: "
def n = System.console().readLine() as Integer
def a = 0, b = 1
n.times {
    print "$a "
    (a, b) = [b, a + b]
}
println()
