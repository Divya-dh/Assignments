println "Enter a sentence:"
def sentence = System.console().readLine() 
def wordCount = [:]
sentence.split(/\s+/).each { word ->
    wordCount[word] = wordCount.get(word, 0) + 1
}
wordCount.each { word, count ->
    println "$word -> $count"
}
