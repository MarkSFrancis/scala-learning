def runFizzBuzzInTerminal: Unit =
  println("Hello world!")
  val pattern = fizzBuzz(1, 100)
  pattern.map(println)

val fizzBuzzPattern = List(3 -> "Fizz", 5 -> "Buzz")

/** 
 * Converts a number to fizz buzz according to its value
 * @param value The value to convert to fizz buzz
 */
def fizzBuzzNumber(value: Int) =
  fizzBuzzPattern.collect({
    case (n, str) if value % n == 0 => str
  }) match {
    case Nil =>
      // Use the original number
      s"$value"
    case strings =>
      // Use the new strings
      strings.mkString
  }

def fizzBuzz(from: Int, upTo: Int) = 
  (from to upTo)
    .map(fizzBuzzNumber)