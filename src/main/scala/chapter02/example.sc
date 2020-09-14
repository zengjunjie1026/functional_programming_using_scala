val s = List(1,2,3)
println(s)

val t = List(true, false, true)
print(s.zip(t))

print(s zip t)

println(t zip s)

val zip_example = List("a", "b", "c").zipWithIndex
print(zip_example)

//fatten

val fatten_example = List(List(1, 2), List(2, 3), List(3, 4)).flatten
println(fatten_example)

// ++ 追加
val list_add = List(1, 2, 3) ++ List(4, 5, 6) ++ List(0)

println(list_add)

//list list fatten
val list_listfatten = List(List(List(1), List(2)), List(List(2), List(3))).flatten
print(list_listfatten)

// map

val list_map = List(1,2,3,4).map(n => (1 to n).toList)

println(list_map)

//
val list_map_fatten = List(1,2,3,4).map(n => (1 to n).toList).flatten
println(list_map_fatten)


val list_map_fatten2 = List(1, 2, 3, 4).flatMap(n => (1 to n).toList)
println(list_map_fatten2)

//groupby

val group_example = Seq("wombat", "xanthan", "yoghurt", "zebra").groupBy(s => if (s startsWith "y") 1 else 2)
println(group_example)


//again

val group_example2 = List(1,2,3,4,5).groupBy(k => k % 3)

println(group_example2)

//sliding

(1 to 10).sliding(4).toList

(1 to 100).map(x => math.cos(x)).sliding(50).map(_.sum / 50).take(5).toList

Seq(1, 2, 3).sortBy(x => -x)

Seq("xx", "z", "yyy").sortBy(word => word)

Seq("xx", "z", "yyy").sortBy(word => word.length)

Seq("xx", "z", "yyy").sorted

//xs.map { x => (math.cos(x), math.sin(x)) }

val ps = Seq(1,2,3,4)
ps.tail
ps.zip(ps.tail)

s.zip(ps.tail).count { case (a, b) => a > b }

val bs = List(1,2,3,4,5)
bs.sliding(3).toList

//bs.sliding(2 * k + 1).map(nested => nested.max)
val s = List(1, 2, 3).map(x => List(1, 2, 3))

List(1, 2, 3).map { y => (1, y) }

val s = List(1, 2, 3).map(x => List(1, 2, 3).map { y => (x, y) })

val s = List(1, 2, 3).map(x => List(1, 2, 3).map { y => (x, y) }).flatten

val s = List(1, 2, 3).flatMap(x => List(1, 2, 3).map { y => (x, y) })

val s = List(1, 2, 3).flatMap(x => List(1, 2, 3).map { y => (x, y) }).map { case (x, y) => ((x, y), x * y) }

val s = List(1, 2, 3).flatMap(x => List(1, 2, 3).map { y => ((x,y), x*y) } )

(1 to 10).flatMap(x => (1 to 10).map { y => (x,y) -> x*y }).toMap

val xs = List(0.1, 0.5, 0.9)

xs.map { x => Seq(x, x*x, math.cos(x), math.sin(x)) }
res25.flatten

res26.max

xs.flatMap { x => Seq(x, math.cos(x), math.sin(x)) }.max


val x = 1 until 10
x.toList

//val str = (1 until 10).toStream
//str.toList

val v = (1 until 10).view

val s = (1 until 10).toIterator
//val t = s.zip(s).toList

val iter = (1 until 10).toIterator
val str = iter.toStream

str.toList

str.zip(str).toList