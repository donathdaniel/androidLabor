
import java.util.*

fun main() {

    //1
    fel1(12,13)

    //2
    val week = listOf<String>("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    fel2(week)

    //3
    fel3(10,40)

    //4
    println("\n" + fel4(fel4("android", ::encode),::decode))

    //5
    val evenNumbers: MutableList<Int> = mutableListOf(1,2,3,4,5,6)
    println(fel5(evenNumbers))

    //6
    fel6(week, evenNumbers)

    //7
    fel7()

    //8
    fel8()
}

fun fel1(a: Int,b: Int){
    println("$a + $b = ${a + b}")
}

fun fel2(week: List<String>){
    for (item in week){
        println(item)
    }

    println(week.filter{it.startsWith("T")})

    println(week.filter{it.contains("e")})

    println(week.filter{it.length == 6})
}

fun fel3(a: Int,b: Int){
    for(i in a..b){
        if(isPrimeNo(i)) print("$i ")
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
    return Base64.getEncoder().withoutPadding().encodeToString(msg.toByteArray())
}

fun decode(msg: String): String {
    return String(Base64.getDecoder().decode(msg))
}

fun fel5(list: List<Int>): List<Int> = list.filter{ it % 2 == 0 }

fun fel6(week : List<String>, numbers : List<Int>){

    println(numbers.map{ it*2 })
    println(week.map{ it.uppercase()} )
    println(week.map{ it[0].lowercaseChar()} )
    println(week.map{ it.length })
    println(week.map{ it.length }.average())
}

fun fel7(){
    var week = listOf<String>("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    week = week.toMutableList()

    week = week.filter{!it.contains('n')}
    println(week)

    for((item, index) in week.withIndex()){
        println("Item at $index is $item")
    }

    week = week.sorted()
    println(week)
}

fun fel8(){
    val randomNumbers = List(10) {(0..100).random()}
    randomNumbers.forEach { println(it) }

    println(randomNumbers.sortedDescending())

    println("The list contains any even number: ${randomNumbers.any { it % 2 == 0 }}")
    println("All the numbers are even: ${randomNumbers.all { it % 2 == 0 }}")
    println("The average: ${randomNumbers.average()}")

}