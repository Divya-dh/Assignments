class DynamicPropertyHandler {
    def propertyMissing(String propertyName) {
        return "undefined"
    }
}
def propertyHandler = new DynamicPropertyHandler()
println propertyHandler.someProperty 
