class DynamicHandler {
    def methodMissing(String methodName, args) {
        println "Method $methodName is not defined"
    }
}
def handler = new DynamicHandler()
handler.someMethod() 
handler.anotherMethod("arg1", "arg2") 
