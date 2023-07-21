package ice

import cats.effect._

object Main extends IOApp.Simple {
  override def run: IO[Unit] = IO {
    val x = "Hello world!"
    //    println(x)
    //    println(myFunction(3))
    //    println(sumInts(List(1, 2, 3)))

    val fizzBuzz = new FizzBuzz()
    println(fizzBuzz.fizzBuzzs(15))
  }

  def myFunction(x: Int): Int = 2 + 2

  def sumInts(xs: List[Int]): Int = {
    val sum = xs.fold(0)(_ + _)
    sum
  }

}