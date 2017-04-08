/**
  * Pack consecutive duplicates of list elements into sublists.
  * If a list contains repeated elements they should be placed in separate sublists.
  * Example:
  * scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  */
object P09 extends App {

  def pack[T](l: List[T]): List[List[T]] =
    l.foldRight(List[List[T]]()) {
      case (a, b :: ts) if a == b.head => (a :: b) :: ts
      case (a, b) => List(a) :: b
    }

  println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}
