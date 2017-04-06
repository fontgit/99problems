/**
  * Created by Andrew on 06.04.2017.
  * Reverse a list.
  * Example:
  * scala> reverse(List(1, 1, 2, 3, 5, 8))
  * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  */
object P05 extends App {


  def reverseBuiltin[T](l: List[T]): List[T] =
    l.reverse

  def reverseFoldLeft[T](l: List[T]): List[T] =
    l.foldLeft(List[T]()) {
      (a, b) => b :: a
    }
  // Simple recursive.  O(n^2)
  def reverseRecursive[A](ls: List[A]): List[A] = ls match {
    case Nil       => Nil
    case h :: tail => reverseRecursive(tail) ::: List(h)
  }

  // Tail recursive.
  def reverseTailRecursive[A](ls: List[A]): List[A] = {
    def reverseR(result: List[A], curList: List[A]): List[A] = curList match {
      case Nil       => result
      case h :: tail => reverseR(h :: result, tail)
    }
    reverseR(Nil, ls)
  }


  println(reverseFoldLeft(List(1, 1, 2, 3, 5, 8)))
  println(reverseBuiltin(List(1, 1, 2, 3, 5, 8)))
  println(reverseRecursive(List(1, 1, 2, 3, 5, 8)))
  println(reverseTailRecursive(List(1, 1, 2, 3, 5, 8)))

}
