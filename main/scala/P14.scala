/**
  * Duplicate the elements of a list.
  * Example:
  * scala> duplicate(List('a, 'b, 'c, 'c, 'd))
  * res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  */
object P14 extends App {
  def duplicate[T](ls: List[T]): List[T] =
    ls.flatMap(e => List(e, e))

  println(duplicate(List('a, 'b, 'c, 'c, 'd)))
}
