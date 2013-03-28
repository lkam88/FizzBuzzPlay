package model

object FizzBuzzCounter {

  def fizzBuzz(number: Int): List[String] = {
    val buffer = new scala.collection.mutable.ListBuffer[String]
    for (x <- 1 to number) {
      var result = ""
      if (x % 3 == 0) {
        result += "Fizz"
      }
      if (x % 5 == 0) {
        result += "Buzz"
      }
      if (result == "") {
        result += x
      }
      buffer += result;
    }
    buffer.toList
  }
}
