// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class FizzBuzzSuite extends munit.FunSuite {
  test("fizz buzz generates correct pattern") {
    val pattern = fizzBuzz(1, 15)
    val expected = IndexedSeq("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")

    assertEquals(pattern, expected)
  }
}
