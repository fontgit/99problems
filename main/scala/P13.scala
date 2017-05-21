/**
  * Run-length encoding of a list (direct solution).
  * Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); do all the work directly.
  * Example:
  * scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  */
object P13 extends App {

  def encodeDirect[T](l: List[T]): List[(Int, T)] =
    l.foldRight(List[(Int, T)]()) {
      case (a, b :: tail) if a == b._2 =>
        (1 + b._1, b._2) :: tail
      case (a, b) => (1, a) :: b
    }

  def encodeDirectWithSpan[A](ls: List[A]): List[(Int, A)] =
    if (ls.isEmpty) Nil
    else {
      val (packed, next) = ls span { _ == ls.head }
      (packed.length, packed.head) :: encodeDirect(next)
    }

  println(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  println(encodeDirectWithSpan(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

}
