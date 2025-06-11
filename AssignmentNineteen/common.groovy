print "Enter first list: "
def list1 = System.console().readLine().tokenize(' ').collect { it as Integer }
print "Enter second list: "
def list2 = System.console().readLine().tokenize(' ').collect { it as Integer }
def common = list1.intersect(list2)
println "Common elements: $common"
