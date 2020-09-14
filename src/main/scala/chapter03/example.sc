
def totalAmountPaid(ps: Seq[(Double, String)]): Double = ps.map(_._1).sum
val x = (10.5, "white") // Sock size and color.
val y = (25.0, "restaurant") // Payment amount and payee.

totalAmountPaid(Seq(x, y))


type MySockTuple = (Double, String)
type PaymentTuple = (Double, String)
val s: MySockTuple = (10.5, "white")
//s: MySockTuple = (10.5,white)
val p: PaymentTuple = (25.0, "restaurant")
//p: PaymentTuple = (25.0,restaurant)

totalAmountPaid(Seq(s, p)) // Nonsense again


case class MySock(size: Double, color: String)
case class Payment(amount: Double, name: String)

val sock = MySock(10.5, "white")
val paid = Payment(25.0, "restaurant")

sock.size
sock.color

paid.amount
paid.name


case class MySock(size: Double, color: String)
case class BagOfSocks(sock: MySock, count: Int)

def printBag(bag: BagOfSocks): String = {
  val BagOfSocks(MySock(size, color), count) = bag // Destructure the ‘bag‘.
  s"bag has $count $color socks of size $size"
    }
val bag = BagOfSocks(MySock(10.5, "white"), 6)


printBag(bag)



def fitsMe(bag: BagOfSocks): Boolean = bag match {
  case BagOfSocks(MySock(size, _), _) => (size >= 10.5 && size <= 11.0)
}



