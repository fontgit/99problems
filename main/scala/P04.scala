/**
  * Created by Andrew on 05.04.2017.
  * Find the number of elements of a list.
  * Example:
  * scala> length(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 6
  *
  */
object P04 extends App {

  def lenghtBuiltin[T](l: List[T]): Int =
    l.size

  def lenghtFold[T](l: List[T]): Int =
    l.map(e => 1).fold(0)(_ + _)

  def lenghtFoldLeft[T](l: List[T]): Int =
    l.foldLeft(0) { (acc, _) =>
      acc + 1
    }

  def lenghtSum[T](l: List[T]): Int =
    l.map(e => 1).sum

  def lenghtRecursive[T](l: List[T]): Int = {

    def lenghtSumRec[T](l: List[T], acc: Int): Int =
      l match {
        case Nil => acc
        case _ :: tail => lenghtSumRec(tail, acc + 1)
      }

    lenghtSumRec(l, 0)
  }
  /*
   * tests
   */
  val lst = List(1, 1, 2, 3, 5, 8)
  println(lenghtBuiltin(lst))
  println(lenghtFold(lst))
  println(lenghtFoldLeft(lst))
  println(lenghtSum(lst))
  println(lenghtRecursive(lst))
}
