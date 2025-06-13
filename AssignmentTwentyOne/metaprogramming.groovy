class DynamicClass {
    String name
    int age
    void introduce() {
        println "Hello, my name is $name and I am $age years old."
    }
}
def dynamicInstance = new DynamicClass(name: "Alice", age: 25)
dynamicInstance.metaClass.address = "123 Main St"
dynamicInstance.metaClass.introduce = { ->
    println "Hello, my name is $name, I am $age years old, and I live at $address."
}
println dynamicInstance.address
dynamicInstance.introduce()
