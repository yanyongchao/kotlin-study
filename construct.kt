import kotlin.reflect.full.memberProperties

class Runoob constructor(name: String) {  // 类名为 Runoob
  // 大括号内是类体构成
  var url: String = "http://www.runoob.com"
  var country: String = "CN"
  var siteName = name

  init {
      println("初始化网站名: ${name}")
  }

  // 次构造函数
  constructor(name: String, alexa: Int) : this(name) {
      println("Alexa 排名 $alexa")
  }

  // 另一个次构造函数
  constructor(name: String, alexa: Int, country: String) : this(name, alexa) {
      this.country = country
      println("国家: $country")
  }

  fun printTest() {
      println("我是类的函数")
  }
}

fun main(args: Array<String>) {
  val runoob1 = Runoob("菜鸟教程", 10000)
  println(runoob1.siteName)
  println(runoob1.url)
  println(runoob1.country)
  runoob1.printTest()

  println()

  val runoob2 = Runoob("菜鸟教程", 10000, "US")
  println(runoob2.siteName)
  println(runoob2.url)
  println(runoob2.country)
  runoob2.printTest()
  val properties = Runoob::class.memberProperties
  for (property in properties) {
      println("${property.name} = ${property.get(runoob2)}")
  }
}
