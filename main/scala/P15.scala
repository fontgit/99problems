/**
  * Duplicate the elements of a list a given number of times.
  * Example:
  * scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
  * res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  */
object P15 extends App {
  def duplicateN[T](n: Int, ls: List[T]): List[T] =
    ls.flatMap { elem =>
      List.range(1, n).map(_ => elem)
    }

}