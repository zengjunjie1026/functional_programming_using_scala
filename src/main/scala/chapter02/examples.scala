package chapter02

/**
 * @author andrew
 * @email zengjunjie1026@163.com
 * @date 2020/9/14 10:59 上午
 * @version 1.0
 */
object examples {
  def main(args: Array[String]): Unit = {


    // tuple
    val a: (Int, String) = (123, "xyz")
    println(a)

    // example b
    val b: (Boolean, Int, Int) = (true, 3, 4)




   // Pattern matching for tuples


     val g = (1, 2, 3)


     val (x, y, z) = g

     println(x)
     println(y)
     println(z)


    println(

      (1, 2, 3) match { case (a, b, c) => a + b + c }
    )


    println(t1((10, ("result is ", 2))))


   // val (x, _, _, z) = ("abc", 123, false, true)

    val p: ((Int, Int )) => Int = { case (x, y) => y }

    val q: (Int => Int, Int => Int) = (x => x + 1, x => x - 1)


    val r: List[(String, Int)] = List(("apples", 3), ("oranges", 2), ("pears", 0))

    val basket: List[(String, Int)] = List(("apples", 3), ("pears", 2), ("lemons", 0))


  }

// define t1
  def t1(p: (Int, (String, Int))): String = p match {
    case (x, (str, y)) => str + (x + y).toString
  }


//define t2
  def t2(p: (Int, (String, Int))): String = p._2._1 + (p._1 + p._2._2).toString

//define t3
  def t3(p: ((Int, String), Int)): String = p._1._2 + (p._1._1 + p._2).toString

  // define t4

  def t4(p: ((Int, String), Int)): String = p match {
    case ((x, str), y) => str + (x + y).toString
  }

}


