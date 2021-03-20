import java.util.*

fun main() {
besties("queen","joy","belyse","rhoda")
    counties()
    numbers()
   println( Arrays.toString(name("jane","nyambura","kamau")))

}
fun besties(a:String, b:String, c:String,d:String){
    var nameArrays= arrayOf(a,b,c,d)
  println(Arrays.toString(nameArrays))
}
fun counties(){
    var Cities= arrayOf("harare","mumbai","dodoma","jakarta")
    for(element in Cities){
        println(element.capitalize())
    }
}
fun numbers(){
    var num= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=num[1].plus(num[4])
    println(sum)
    println(num.indexOf(158))
    println(Arrays.toString(num.sortedArray()))

}
fun name(a: String,b:String,c: String) :Array<String>{
  var names= arrayOf(a,b,c)
  return names
}

