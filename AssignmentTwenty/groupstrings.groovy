def input = System.console().readLine() 
def words = input.tokenize()  
def grouped = [:].withDefault { [] }  
words.each { word ->
    grouped[word.length()] << word
}
grouped.each { length, wordList ->
    println "$length -> $wordList"
}
