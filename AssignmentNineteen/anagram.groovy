print "Enter first string: "
def str1 = System.console().readLine()
print "Enter second string: "
def str2 = System.console().readLine()
def isAnagram = str1.toLowerCase().toList().sort() == str2.toLowerCase().toList().sort()
println "$isAnagram"
