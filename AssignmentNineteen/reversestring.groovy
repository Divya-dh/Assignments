print "Enter a string to reverse: "
def str = System.console().readLine()
def reversed = ''
for (int i = str.length() - 1; i >= 0; i--) {
    reversed += str[i]
}
println "Reversed string: $reversed"
