var sum = { x: Int, y: Int -> x + y }
var log = { println("Hello, world!") }
val square: (Int) -> Int = { x -> x * x }

val numbers = listOf(1, 2, 3, 4, 5)
val doubled = numbers.map { it * 2 }


val numbers = listOf(1, 2, 3, 4, 5)
val evenNumbers = numbers.filter { it % 2 == 0 }

fun main () {
  println(doubled)
}