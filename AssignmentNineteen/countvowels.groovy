print "Enter a string: "
def str = System.console().readLine()
def vowels = 'aeiouAEIOU'
def count = 0
str.each { if (vowels.contains(it)) count++ }
println "Vowel count: $count"
