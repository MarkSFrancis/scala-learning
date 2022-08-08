var items = ("Item1", "Item2", "Item3")

def getPartOfArray =
  items match {
    case (_, item2, item3) => s"$item2 $item3"
  }
