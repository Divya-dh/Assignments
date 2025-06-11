print "Enter list elements: "
def input = System.console().readLine()
def list = input.tokenize(' ').collect { it as Integer }
def uniqueList = list.unique()
println "List without duplicates: $uniqueList"
