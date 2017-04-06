/**
  * Created by Andrew on 05.04.2017.
  */
/**
  * Find the one but the last element of the list
  */
object P02 extends App {
  val lst = List(4, 5, 4, 0, 1)
  val lstSinglton = 1 :: Nil

  def lastButOne[T](l: List[T]): T = l match {
    case elem :: _ :: Nil => elem
    case _ :: tail => lastButOne(tail)
    case _ => throw new NoSuchElementException
  }

  def lastButOne2[T](l: List[T]): T = {
    if (l.size < 2)
      throw new NoSuchElementException
    else
      l.takeRight(2).head
  }

  def penultimateBuiltin[A](ls: List[A]): A =
    if (ls.isEmpty) throw new NoSuchElementException
    else ls.init.last

  println(lastButOne(lst))
  println(lastButOne2(lst))
//  println(lastButOne(lstSinglton))
//  println(lastButOne2(lstSinglton))
}
