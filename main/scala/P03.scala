/**
  * Created by Andrew on 05.04.2017.
  * By convention, the first element in the list is element 0.
  * Example:
  *
  * scala> nth(2, List(1, 1, 2, 3, 5, 8))
  * res0: Int = 2
  */
object P03 extends App {

  def nth1[T](index: Int, l: List[T]): T = {
    l.drop(index)
      .headOption
      .getOrElse(throw new NoSuchElementException)
  }

  def nthBuiltin[A](n: Int, ls: List[A]): A =
    if (n >= 0) ls(n)
    else throw new NoSuchElementException

  def nthRecursive[A](n: Int, ls: List[A]): A = (n, ls) match {
    case (0, h :: _) => h
    case (i, _ :: tail) => nthRecursive(i - 1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }

  println(nth1(2, List(1, 1, 2, 3, 5, 8)))
  println(nthBuiltin(2, List(1, 1, 2, 3, 5, 8)))
}
