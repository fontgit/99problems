/**
  * Drop every Nth element from a list.
  * Example:
  * scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  */
object P16 extends App {
  def drop[T](n: Int, xs: List[T]): List[T] =
    xs.zipWithIndex.flatMap {
      case (_, i) if (i + 1) % n == 0 => Nil
      case (e, _) => List(e)
    }

  def dropWithFor[T](n: Int, xs: List[T]): List[T] =
    (for {
      i <- xs.indices
      if (i + 1) % n != 0
    } yield xs(i)).toList

  println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  println(dropWithFor(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  println("message")
}
