class ArraysSuite extends munit.FunSuite {
  test("gets last 2 items from array with 3 items") {
    val pattern = getPartOfArray
    val expected = "Item2 Item3"

    assertEquals(pattern, expected)
  }
}
