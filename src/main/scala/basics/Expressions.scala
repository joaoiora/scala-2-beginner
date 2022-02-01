package basics

/**
 * @author Joao Iora
 */
object Expressions extends App {

  val x = 1 + 2 // Expression
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var variable = 2
  variable += 3 // also works with -= *= /= .......... side effects
  println(variable)

  // Instructions (do something) vs Expressions (has value and/or type)

  // IF expression
  val condition = true
  val conditionedValue = if (condition) 5 else 3 // Already returns the value
  println(conditionedValue)
  println(if (condition) 5 else 3)
  println((if (condition) 5 else 3) == 5)

  // Iteration
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  val weirdValue: Unit = (variable = 3) // Unit == void
  println(weirdValue)

  // side effects when returning Unit (println, while's, reassigning)

  // Code blocks

  val codeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "Hello" else "goodbye"
  }
  println(codeBlock)

  // z only exists inside codeBlock scope
  //  val anotherValue = z + 1;

  // 1. difference between "hell world" vs println("hello world")?
  // "hello world" is a String, println("hello world") is an Unit
  var helloWorld : String = "helloworld"
  println("hello world")
  println(helloWorld.equals(println("hello world")))

  // 2. What is the value of

  // value: true
  val someValue = {
    2 < 3
  }
  println(someValue)

  // value: 42
  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }
  println(someOtherValue)

}
