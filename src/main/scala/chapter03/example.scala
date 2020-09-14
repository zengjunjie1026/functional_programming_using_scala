package chapter03

/**
 * @author andrew
 * @email zengjunjie1026@163.com
 * @date 2020/9/14 5:06 下午
 * @version 1.0
 */
object example {
  def main(args: Array[String]): Unit = {

    totalAmountPaid(Seq(x, y))


  }

  def totalAmountPaid(ps: Seq[(Double, String)]): Double = ps.map(_._1).sum
  val x = (10.5, "white") // Sock size and color.
  val y = (25.0, "restaurant") // Payment amount and payee.

}
