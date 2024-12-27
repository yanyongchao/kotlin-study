class Example {
  lateinit var name: String

  fun initializeName() {
      name = "Kotlin"
  }

  fun printName() {
      if (::name.isInitialized) {
          println(name)
      } else {
          println("Name is not initialized")
      }
  }
}

fun main() {
  val example = Example()
  example.printName() // 输出 Name is not initialized
  example.initializeName()
  example.printName() // 输出 Kotlin
}