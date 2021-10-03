import java.util.*
import kotlin.random.Random.Default.nextInt

fun main() {

    fel1(12,13)

    val week = listOf<String>("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    fel2(week)

    fel3(10,40)

    println()
    println(fel4(fel4("android", ::encode),::decode))

    val evenNumbers: MutableList<Int> = mutableListOf(1,2,3,4,5,6)
    println(fel5(evenNumbers))

    fel6()

    fel7()

    fel8()
}

fun fel1(a: Int,b: Int){
    val c = a + b
    println("$a+$b=$c")
}

fun fel2(week: List<String>){
    for (item in week){
        println(item)
    }

    val containsT = week.filter{it.contains("T")}
    println(containsT)

    val containse = week.filter{it.contains("e")}
    println(containse)

    val lenghtis6 = week.filter{it.length == 6}
    println(lenghtis6)
}

fun fel3(a: Int,b: Int){
    for(i in a..b){
        if(isPrimeNo(i)) print("$i ");
    }
}

fun isPrimeNo(number: Int): Boolean {
    if(number<2) return false
    for (i in 2..number/2) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

fun fel4(msg: String, func: (String) -> String): String {
    return func(msg)
}

fun encode(msg: String): String{
    return Base64.getEncoder().withoutPadding().encodeToString(msg.toByteArray());
}

fun decode(msg: String): String {
    return String(Base64.getDecoder().decode(msg))
}

fun fel5(list: List<Int>): List<Int> = list.filter{it %2==0}

fun fel6(){
    val week = listOf<String>("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    val numbers: MutableList<Int> = mutableListOf(1,2,3,4,5,6)

    println(numbers.map{it*2})

    println(week.map{it.toUpperCase()})

    println(week.map{it[0].toLowerCase()})

    println(week.map{it.length})

    println(week.map{it.length}.average())
}

fun fel7(){
    var week = listOf<String>("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    week = week.toMutableList()

    week = week.filter{!it.contains('n')}
    println(week)

    for((item, index) in week.withIndex()){
        println("Item at $index is $item")
    }

    week = week.sorted();
    println(week)
}

fun fel8(){
    val randomNumbers = List(10) {(0..100).random()}
    randomNumbers.forEach { println(it) }

    println(randomNumbers.sortedDescending())

    var ok: Boolean = false
    randomNumbers.forEach { if(it%2 == 0) ok = true; }
    if(ok) println("The list contains any even number.")

    ok = true
    randomNumbers.forEach { if(it%2 != 0) ok = false; }
    if(ok) println("All the numbers are even.")

    var sum = 0
    randomNumbers.forEach { sum +=it }
    println("The average: $sum")
}