/**
  * Find out whether a list is a palindrome.
  * Example:
  * scala> isPalindrome(List(1, 2, 3, 2, 1))
  * res0: Boolean = true
  */
object P06 extends App {

  def isPalindromeLong[T](l: List[T]): Boolean = {
    if (l.size <= 1) true
    else if (l.head != l.last) false
    else isPalindromeLong(l.init.tail)
  }

  def isPalindrome[A](ls: List[A]): Boolean =
    ls == ls.reverse

  println(isPalindrome(List(1, 2, 3, 2, 1)))
}
