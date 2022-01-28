package basics

/**
 * @author Joao Iora
 */
object ValuesVariablesTypes extends App {

  /**
   * Val's are immutable, similar to const/final on c++/Java.
   * Compiler can infer val types.
   */

  val x = 42
  println(x)

  val string : String = "hello"
  val anotherString = "world";
  println(string)

  val bool : Boolean = false;
  val anotherBool = true;
  println(bool.toString + " - " + anotherBool.toString)

  val character = 'a';
  val characterInt : Int = character;
  println(character + " - " + characterInt)

  var short : Short = 4613
  var long : Long = 31241212412412L
  var float : Float = 2.03123122131231231f
  var double : Double = 3.14
  println(short + " - " + long + " - " + float + " - " + double)

  var variable = 5
  println("> variable = " + variable)
  println("> variable class = " + variable.getClass.toString)
  variable = variable * 2;
  println(">> variable = " + variable)
  println(">> variable class = " + variable.getClass.toString)

}
