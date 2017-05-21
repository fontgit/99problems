/**
  * Decode a run-length encoded list.
  * Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
  * Example:
  * scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  * res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  */
object P12 extends App {

  def decodePattMatching[T](l: List[(Int, T)]): List[T] =
    l.flatMap {
      case (n, elem) => List.range(0, n).map(_ => elem)
    }

  def decodeForComprehension[T](l: List[(Int, T)]): List[T] =
    l.flatMap(t => decodeTuple(t._1, t._2))

  def decodeTuple[T](n: Int, elem: T): List[T] =
    (for (i <- 1 to n)
      yield elem)
      .toList

  println(decodeTuple(4, 'a))
  println(decodePattMatching(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
  println(decodeForComprehension(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))

}
