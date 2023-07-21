package ice

class FizzBuzz {
  def fizzBuzz(n: Int): String =
    if (n % 3 == 0) "Fizz"
    else if (n % 5 == 0) "Buzz"
    else n.toString

  def fizzBuzzs(n: Int): List[String] = (1 to n).map(x => matchFizzBuzz(x)).toList

  def matchFizzBuzz(x: Int): String = x match
    case _ if divisibleBy(x, 15) => "FizzBuzz"
    case _ if divisibleBy(x, 3) => "Fizz"
    case _ if divisibleBy(x, 5) => "Buzz"
    case _ => x.toString

  def divisibleBy(n: Int, d: Int): Boolean = n % d == 0

}
