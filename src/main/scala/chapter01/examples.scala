package chapter01

/**
 * @author andrew
 * @email zengjunjie1026@163.com
 * @date 2020/9/14 10:00 上午
 * @version 1.0
 */
object examples {
  def main(args: Array[String]): Unit = {
    println((1 to 10).product)

    val fac10 = (1 to 10).product

    println(fac10)


    val demo =  100 + (1 to 10).product + 100

    println(demo)


    println(f(10))


    // nameless function

    val fac = (n: Int) => (1 to n).product
    val fac2 = (n: Int) => (1 to n).product

    println(fac(5))

    println( ((n: Int) => (1 to n).product)(10))

    println(((n: Int) => n*n*n + n*n)(12345))

    println({val n = 12345; n*n*n + n*n})

    println(is_prime(97))

    // or nameless function
    val is_even2 = (k: Int) => if (k % 2 == 0) 1 else 0

    val list_sum = List(1, 2, 3).sum

    println(list_sum)

    val list_map =  List(1, 2, 3).map(x => x*x + 100*x)
    print("[")
    list_map.foreach(println)
    println("]")


    val arr = List(1, 2, 3).map(func1)

    print("[")
    arr.foreach(println)
    println("]")


    println(List(1, 2, 3) map func1)


    def count_even_example(s: List[Int]): Int = s
      .map { k => if (k % 2 == 0) 1 else 0 }
      .sum

    // validate count_oven
    println(count_even(List(1,2,3,4,5)))

    //validate count_oven example

    println(count_even_example((1 to 100).toList))

    //Filtering and truncating a sequence

    //minium value
    println(List(10, 20, 30).max)

    //maxium value
    println(List(10, 20, 30).min)

    //count

    println(List(10, 20, 30).size)

    //filter

    println(List(1, 2, 3, 4, 5).filter(k => k % 3 != 0))
    println(List(1, 2, 3, 4, 5).takeWhile(k => k % 3 != 0))

    //takewhile

    println((1 to 10)
      .map(k => math.abs(math.sin(k + 2)))
      .product)

    //aggregation

    println((1 to 10)
      .filter(k => math.cos(k) > 0)
      .map(k => math.sqrt(math.cos(k)))
      .sum)

    // validate average

    println(average(List(1.0, 2.0, 3.0)))


    //validate sum(2n/ (2n + 1))

    println(math.cos(wallis(10000)))


    // 欧拉求pi

    println(euler_series(100000))

    val pi = 4*math.atan(1)

    println( pi*pi/6)


    println(sine_product(n = 100000, x = 0.1))

    print(math.sin(pi*0.1)/pi/0.1)

    //Define a function p that takes a list of integers and a function f: Int => Int, and
    //returns the largest value of f (x) among all x in the list.
    println( p(List(2, 3, 4, 5), x => 60 / x))

    //validate array list greater than 3

    println(f(List( List(1,2), List(1,2,3), List(1,2,3,4) )))

    println((1 to 10).toList.filter(k => (1 to k).filter(j => j*j > 2*k).size >= 3))

    println( summation(1, 10, x => math.sqrt(x)))


    // validate 0to5 求积分

    println(integration(0, 5, x => x*x*x*x, eps = 0.01)) //exact answer is 625

    integration(0, 7, x => x*x*x*x*x*x, eps = 0.01) // Exact answer is 117649



  }

  //定义阶乘
  def f(n:Int) = (1 to n).product

  //定义是否为素数
  def is_prime(n: Int) = (2 to n-1).forall(k => n % k != 0)

  // define one function
  def func1(x: Int): Int = x*x + 100*x


  //奇数和偶数
  def is_even(k: Int): Int = (k % 2) match {
    case 0 => 1 // First, check if it is zero.
    case _ => 0 // The underscore matches everything else.
  }

  //计算数组中偶数的个数
  def count_even(s: List[Int]) = s.map(is_even).sum

  def is_prime_another(n: Int): Boolean =
    (2 to n-1)
      .takeWhile(k => k*k <= n)
      .forall(k => n % k != 0)

  //求一个数组的平均数
  def average(s: List[Double]): Double = s.sum / s.size


  def wallis_frac(i: Int): Double = (2*i).toDouble/(2*i - 1)*(2*i)/(2*i + 1)

  def wallis(n: Int) = (1 to n).map(wallis_frac).product


  //欧拉求和
  def euler_series(n: Int): Double = (1 to n).map(k => 1.0/k/k).sum


  def sine_product(n: Int, x: Double): Double = (1 to n).map(k => 1.0 - x*x/k/k).product

  def p(s: List[Int], f: Int => Int): Int = s.map(f).max

  //返回大于长度为3的数组
  def f(s: List[List[Int]]): List[List[Int]] = s.filter(t => t.size >= 3)


  //define function

  def summation(a: Int, b: Int, g: Int => Double): Double = (a to b).map(g).sum

  // 求积分
  def integration(a: Double, b: Double, g: Double => Double, eps: Double): Double = {
    // First, we define some helper values and functions that replace
    // the definitions "where n = ..." in the mathematical formula.
    val n: Int = 2 * ((b - a) / eps).toInt
    val delta_x = (b - a) / n
    val s1 = (1 to (n - 1) by 2).map { i => g(a + i * delta_x) }.sum
    val s2 = (2 to (n - 2) by 2).map { i => g(a + i * delta_x) }.sum
    // Now we write the expression for the final result.
    delta_x / 3 * (g(a) + g(b) + 4 * s1 + 2 * s2)
  }



}
