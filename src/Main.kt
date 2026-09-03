import kotlinx.coroutines.*
import java.io.File
import java.net.URL
import javax.net.ssl.HttpsURLConnection
import kotlin.math.PI
import kotlin.time.Duration.Companion.milliseconds

val String.isLong: Boolean
    get() = this.length > 5

fun main() {

    val listInt = listOf<Int>(5, 22, 1000, 4, 5, 6)
    println("Hello Word")

    // Kotlin Source code. ===>>> JDK ( Java Development Kit )   ===> JAVA Bytecode  ===> (JVM) ==> ( Win, Linux ,Mac)
    val list = mutableListOf<String>()

    val listAny: MutableList<Any> = mutableListOf("one", "two", "three", "four", 18, 33, 4, 5, 6, 7, 8, 9, 66f, 9.22)
    var sumList = 0
    for (i in listInt) {
        sumList += i
        println(i)
    }

    print(sumList)
    checkAny(listAny)


    val byteMaxValue = Byte.MAX_VALUE
    val byteMinValue = Byte.MIN_VALUE
    println("byteMaxValue: $byteMaxValue")
    println("byteMinValue: $byteMinValue")

//     kotlin data types
//    │
//    ├── Number
//    │   ├── Byte
//    │   ├── Short
//    │   ├── Int
//    │   ├── Long
//    │   ├── Float
//    │   └── Double
//    │
//    ├── Boolean
//    │
//    ├── Char
//    │
//    ├── String
//    │
//    ├── Array
//    │
//    ├── Collections
//    │   ├── List
//    │   ├── Set
//    │   └── Map
//    │
//    ├── Any
//    ├── Unit
//    └── Nothing

    val myCharValue = "d"
    val isChecked = true
// Operator and conditionals (toan tu va dieu kien)
    val x = 4
    val y = 5
    println("result : ${x + y}")
// +,-,*,/,%

    // download file
    /* println("nhap ten file : ")
     val nameFile = readln()
     println("nhap link file : ")
     val linkURl = readln()
     loadURl(linkURl, nameFile)*/

    // tim so chan le
//    println("enter number : ")
//    val z = readln().toIntOrNull() ?: 0
//    if (z % 2 == 0) {
//        println("even")
//    } else {
//        println("odd")
//    }

//    println("findMax  :  ")
//
//    findMax3Number()
//
//    tongCacSoN()
//
//    inBangCuuChuong()
//
//    demSoCacChuSo()
//
//    kiemTraSoNguyenTo()
//
//    inSoNguyenTo()
//
//    fibonacci()
//    println(reversed("Hello World"))
//    demNguyenAm("hihi")

//    findMaxNumber()
//    soLanXuatHien()
//    quanLySinhVien()

//    wordCounter()

//    val admin = BankAccount("admin",900000.0)
//    admin.deposit(100000.0)
//    admin.withdraw(10000000000.0)
//    admin.showBalance()
    /*filterSimple()*/
    oopKotlin()

    Logger.log("this is object")
    println(Calculator.add(4, 5))

    val status = PaymentStatus.PAID

    when (status) {
        PaymentStatus.PAID -> {
            println("thanh toan thanh cong")
        }

        PaymentStatus.FAILED -> {
            println("thanh toan that bai")
        }

        PaymentStatus.PENDING -> {
            println("dang cho")
        }

    }

    val dog = Dog()
    val meow = Meow()
    dog.eat("Dog1")
    dog.barK("dog1")
    meow.sound()
    dog.sound()

    val circle = Circle(5.0)
    val rectangle = Rectangle1(4.0, 6.0)

    println(circle.area())
    println(rectangle.area())

    val duck = Ducky()
    duck.fly()
    duck.swim()

    val bird = Bird()

    bird.fly()
    bird.describe()

    val c = C()
    c.show()

    val animals: List<Animal1> = listOf(Dog1(), Cat())
    for (animal in animals) {
        animal.sound()
    }

    val draws: List<Drawable> = listOf(Circle1(), Square())
    for (draw in draws) {
        draw.draw()
    }
    val calculator = Calculator1()
    println(calculator.add(10, 20))


    val cpu = Computer().CPU()
    cpu.show()


    val listener = object : ClickListener {
        override fun onClick() {
            println("click")
        }
    }
    listener.onClick()

    val box1 = Box("hehe")
    val box2 = Box(8)
    val box3 = Box(9.00)
    println("box1: ${box1.value}")
    println("box2: ${box2.value}")
    println("box3: ${box3.value}")

    showValue("ahihi")
    showValue(0.2)
    showValue(students)

    feed(Cat2())
    feed(Dog2())

    val box = DataBox("Chiro", 200)
    println("${box.data1} + ${box.result} ")
    val carBox = VehicleBox(Car1())
    val bikeBox = VehicleBox(Bike())

    carBox.start()
    bikeBox.start()

    val animalBox5: Box5<Dog5> = Box5<Dog5>()
    animalBox5.add(Dog5())

    printAnimal(Dog5())
    printAnimal(Cat5())


    val box4 = Box2("Chiro")
    val box6 = Box2(100)
    val box5 = Box2(220.5)

    box4.showValue()
    box6.showValue()
    box5.showValue()


    val dog1 = Dog91()
    val cat1 = Cat91()

    dog1.showAnimal()
    cat1.showAnimal()


    val box12 = Box92("Chiro")
    val box22 = Box92(100)
    val box32 = Box92(20.5)

    println(box12.description)
    println(box22.description)
    println(box32.description)

    val id: UserId = "UserID_01"
    printUser(id)


    val users: UserList = listOf(
        "Chiro",
        "An",
        "Bình"
    )
    println("users: $users")

    checkType<String>("ahihi")
    checkType<Int>(0.22)
    checkType<Double>(0.99)
    execute {
        println("execute")
    }

    execute {
        println("hehe")
    }

    val sum = calculate(10, 10) { a, b ->
        a + b
    }

    val abc = calculate(10, 99) { a, b ->
        a * b

    }
    println("sum: $sum")
    println("abc: $abc")

    login("admin", "admin", onSuccess = {
        println(" login success")


    }, onFailure = { it ->
        println(it)

    })
    process("Chiro") {

        println(it)
    }

    process(200) {
        println(it)
    }
    val p1 = Point(10, 10)
    val p2 = Point(22, 29)
    val p3 = p1.plus(p2)
    println(p3)

    val ca1 = Calculator2()
    val rq11 = ca1(22, 33)
    println(rq11)
    processAnimal(Dog100()) {
        it.bark()
        it.eat()
    }

    processAnimal(Cat100()) {
        it.eat()
    }


    task1()
    task2()
//
//    Thread {
//        Thread.sleep(3000)
//        println("Tác vụ A hoàn thành")
//    }.start()
//
//    println("Tác vụ B đang chạy")


    runBlocking {

        println("Helloo")
        downloadData()
        println("Enddd.....")
    }

    runBlocking {
        launch {
            delay(1000.milliseconds)
            println("da xu ly xong ...")
        }

        println("ahiiihihihihih")
    }

    runBlocking {

        val rs = async {
            delay(2000.milliseconds)
            println("dang tinh toan ...")
            10 + 20
        }
        val def = async { 40 + 20 }
        println(def.await())

        println("dang tra kq ...")
        println(rs.await())
    }



    runBlocking {
        supervisorScope {
            launch {
                delay(3000)
                throw Exception("Co 1 loix")
            }
            launch {
                delay(5000)
                println("dang tra kq ...")
            }
            launch {
                delay(4000)
                println("dang tra kq ...")
            }
            launch {
                delay(7000)
                println("dang tra kq ...")
            }
        }

        val job = launch(Dispatchers.Default) {

            var i = 0

            delay(1000)

            while (true) {
                i++
                println("$i")

            }

        }

        job.cancel()
    }



}

suspend fun downloadData() {
    println("Bat dau")
    delay(1000)
    println("xong......")

}


fun <T : Animal100> processAnimal(animal: T, action: (T) -> Unit) {
    action(animal)

}

fun task1() {
    println("Task 1")
}

fun task2() {
    println("Task 2")
}


open class Animal100 {

    fun eat() {
        println("Eating")
    }
}

class Dog100 : Animal100() {
    fun bark() {
        println("Barking")
    }
}

class Cat100 : Animal100()
class test99 : Animal100() {}


class Calculator2 {
    operator fun invoke(a: Int, b: Int): Int {
        return a + b
    }
}

data class Point(val x: Int, val y: Int)

operator fun Point.plus(p: Point) = Point(x + p.x, y + p.y)

fun <T> process(value: T, action: (T) -> Unit) {
    action(value)

}


fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun login(user: String, password: String, onSuccess: () -> Unit, onFailure: (String) -> Unit) {
    if (user == "admin" && password == "admin") {
        onSuccess()
    } else {
        onFailure("Invalid username or password")
    }

}

inline fun execute(action: () -> Unit) {
    action()
}

inline fun <reified T> checkType(value: Any) {
    if (value is T) {
        println("dung kieu ")

    } else {
        println("Sai kieu")
    }

}
//typealias dung de doc code de hon , k lam thay doi kieu du lieu
typealias UserId = String
typealias UserList = List<String>


fun printUser(userid: UserId) {
    println(userid)
}


data class Box92<T>(
    val value: T
)

val <T> Box92<T>.description: String
    get() = "Value: $value"


data class Box2<T>(
    val value: T
)

open class Animal91 {

    fun eat() {
        println("Eating")
    }
}

class Dog91 : Animal91()

class Cat91 : Animal91()

fun <T : Animal91> T.showAnimal() {
    println(this)
}

fun <T> Box2<T>.showValue() {
    println(value)
}

open class Animal5 {
    fun eat(s: String) {
        println("eat $s")
    }
}

fun <T> printAnimal(animal: T) where T : Animal5 {
    animal.eat("hehe")

}

class Dog5 : Animal5() {
    fun bark() {
        println("bark")
    }
}

class Cat5 : Animal5() {}

class Box5<in T> {
    fun add(value: T) {
        println("add $value")
    }
}

open class Vehicle {
    fun run() {
        println("Vehicle is running")
    }
}

class VehicleBox<T : Vehicle>(val vehicle: T) {
    // generics with class
    fun start() {
        vehicle.run()
    }
}

class Car1 : Vehicle()
class Bike : Vehicle()

fun <T : Animal2> feed(animal: T) {

    // generics with func
    animal.eat()
}

class DataBox<T, R>(
    val data1: T,
    val result: R
)

open class Animal2 {

    fun eat() {
        println("Eating")
    }
}

class Dog2 : Animal2()
class Cat2 : Animal2()

class Box<T>(val value: T)

fun <T> showValue(value: T) {
    println(value)
}


interface ClickListener {
    fun onClick()
}

class Computer {
    val brand = "Apple"

    inner class CPU {

        fun show() {
            println("CPU : $brand")
        }
    }
}

internal class Calculator1 {

    internal fun add(a: Int, b: Int): Int {
        return a + b
    }
}

interface Drawable {
    fun draw()
}

class Circle1 : Drawable {
    override fun draw() {
        println("Circle1")
    }
}

class Square : Drawable {
    override fun draw() {
        println("Square")
    }
}


abstract class Animal1 {
    abstract fun sound()
}

class Dog1 : Animal1() {
    override fun sound() {
        println("Dog barks")
    }
}

class Cat : Animal1() {
    override fun sound() {
        println("Cat meows")
    }
}


class C : A, B {
    override fun show() {
    }
}

interface A {
    fun show() {
        println("A")
    }
}

interface B {
    fun show() {
        println("B")
    }
}

class Ducky : Flyable, Swimmable {

    override fun fly() {
        println("fly to the moon")
    }

    override fun swim() {
        println("swim to the moon")
    }

}


class Bird : Flyable {
    override fun fly() {
        println("fly to the moon")
    }

}

interface Flyable {
    fun fly()
    fun describe() {
        println("This object can fly")
    }
}

interface Swimmable {
    fun swim()
}

abstract class Shape {
    abstract fun area(): Double
}

class Rectangle : Shape() {
    override fun area(): Double {
        TODO("Not yet implemented")
    }
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double = radius * radius * PI
}

class Rectangle1(val width: Double, val height: Double) : Shape() {
    override fun area(): Double = width * height
}

open class Animal {
    val name: String? = null

    fun eat(name: String) {
        println("$name eat")
    }

    open fun sound() {
        println("sound animal")
    }
}

class Dog : Animal() {

    fun barK(name: String) {
        println("$name is barking")
    }

    override fun sound() {
        println("Dog animal")
    }
}

class Meow : Animal() {

    override fun sound() {
        println("meow animal")
    }
}


enum class PaymentStatus {
    PENDING, PAID, FAILED
}

class Calculator {

    companion object {
        fun add(a: Int, b: Int): Int {
            return a + b
        }
    }
}

object Logger {
    fun log(msg: String) {
        println(msg)
    }
}

fun oopKotlin() {
    // tao class
    val car = Car("Vinfast", 2021)
    car.showInfo()

    // 2 constructor
    val students = StudentN("chiro")
    val students1 = StudentN("chiro", 19, 9.0)

    // init block
    val bankAccountNumber = BankAccountNumber("chiro", 900.0)

    // this, innit.

    val user = User("chiro", 19)
    user.updateInfo("chiro hihi", 20)

    user.showInfo()

    // private,public,protected,internal

    val account = BankAccountN(1000.0)

    account.deposit(500.0)
    account.withdraw(200.0)

    account.showBalance()

    user.login("123456")

    val person = Person()
    person.age = -2000
    println(person.age)


    val product1 = Product("iPhone", 2000.0)
    val product2 = Product("iPhone", 2000.0)
    println(product1)
    println(product1 == product2)

    val product3 = product1.copy(price = 1800.0)

    println(product3)

    val product4 = UserN("chiro", 28, "chiro@gmail.com")
    val product5 = product4.copy(name = "Chiro1")
    val (name, age, email) = product5

    println("$name, $email, $age")


}

data class UserN(
    val name: String,
    val age: Int,
    val email: String
)

data class Product(val name: String, val price: Double)

class BankAccountN(private var balance: Double) {

    fun deposit(amount: Double) {
        balance += amount
    }

    fun showBalance() {
        println("Balance: $balance")
    }

    fun withdraw(amount: Double) {
        if (balance >= amount) {
            balance -= amount
        }
    }
}

class Person {
    var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Age: khong hop le")
            }
        }
}


class User(var name: String, var age: Int, private val passWord: String = "") {
    init {
        showInfo()
    }

    fun login(inputPassword: String) {}

    private fun checkPassword(inputPass: String) {}

    fun updateInfo(name: String, age: Int) {
        this.age = age
        this.name = name
    }

    fun showInfo() {
        println("name : $name \n age : $age")
    }
}

class Car(val brand: String, val year: Int) {
    fun showInfo() {
        println("Brand : $brand \n Year : $year")
    }

}

class BankAccountNumber(val owner: String, val balance: Double) {

    init {
        println("Tài khoản của $owner được tạo : $owner")
        if (balance < 0.0) {
            println("so du khong hop le")
        } else {
            println("so du hop le")
        }

    }
}

class StudentN(val firstName: String, val age: Int, val score: Double) {
    constructor(name: String) : this(name, 18, 0.0)

    init {
        println("First Name : $firstName , Age : $age, Score : $score")
    }
}

data class Student(
    val name: String,
    val age: Int
)

val students = listOf(
    Student("An", 17),
    Student("Binh", 20),
    Student("Chiro", 22),
    Student("Nam", 16),
    Student("Long", 25)
)

fun filterSimple() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 10)
    val listResult = numbers.filter { number -> number % 2 == 0 }
    println(listResult)

    val listResult1 = numbers.map { number -> number * 2 }
    println(listResult1)

    val listName = listOf("An", "Binh", "Tam", "Long", "Kien", "Hoang")
    listName.forEach { name -> println("student $name") }

    students.filter { student -> student.age >= 18 }.map { student -> student.name }
        .forEach { student -> println(student) }

    val hasOdd = numbers.any { number -> number % 2 != 0 }
    val hasEven = numbers.all { number -> number % 2 == 0 }

    println(hasOdd)
    println(hasEven)

    val res = numbers.count { number -> number % 2 == 0 }
    println(res)

    val numbers2 = listOf(10, 20, 30, 40, 50)
    println(numbers2.sum())
    println(numbers2.average())
    println(numbers2.maxOrNull() ?: "Khong co du lieu ")
    println(numbers2.minOrNull() ?: "Khong co du lieu ")

    val result = students.groupBy { student ->
        student.age
        // tra ve key, list(value)
    }

    result.forEach { (age, students) ->
        println("$age → ${students.map { it.name }}")
    }
    students.associateBy({ it.age }) { student -> student }

    result.forEach { (age, students) ->
        println("$age → ${students}")
    }

    val numbers3 = listOf(1, 2, 3, 4, 5)
    println(numbers3.fold(0) { acc, number -> acc + number })

    val result4 = numbers.reduce { acc, number ->
        number + acc
    }
    println(result4)

    val numbers4 = listOf(1, 2, 3, 4, 5)

    val result5 = numbers4.fold("") { acc, number ->
        if (acc.isEmpty()) {
            number.toString()
        } else {
            "$acc-$number"
        }
    }
    println(result5)


    val names = listOf("An", "Binh", "Chiro", "Long")
    val scores = listOf(8, 7, 10, 9)

    val result6 = names.zip(scores)

    // Pair, triple chua 2 gia tri hoac 3 gia tri
    result6.forEach {
        println(it)
    }

    val numbers7 = listOf(1, 2, 2, 3, 4, 4, 5, 2, 3)
    val result7 = numbers7.toSet()
    println(result7)

    val setA = setOf(1, 2, 3, 4, 5)
    val setB = setOf(4, 5, 6, 7, 8)

    val result8 = setA union setB
    val result9 = setA intersect setB
    println(result8)
    println(result9)

    val scores1 = mapOf("An" to 8, "B" to 9, "Chiro" to 10)
    println(scores1.getOrDefault("An", 0))

    val scores3 = mapOf(
        "An" to 8,
        "Binh" to 5,
        "Chiro" to 10,
        "Long" to 6,
        "Nam" to 9
    )

    val kq = scores3.filter { it.value >= 8 }
    println(kq)

    val scores4 = mapOf(
        "An" to 8,
        "Binh" to 7,
        "Chiro" to 10
    )

    val kq1 = scores4.map { (name, score) -> "$name :$score" }

    println(kq1)

    data class Student(
        val name: String,
        var age: Int,
        val score: Double
    )

    val students6 = listOf(
        Student("An", 20, 7.5),
        Student("Binh", 18, 9.0),
        Student("Chiro", 22, 8.5),
        Student("Long", 19, 6.5)

    )

    val kq5 = students6.sortedBy { it.score }
    println(kq5)

    val students = listOf(
        Student("An", 20, 7.5),
        Student("Binh", 18, 9.0),
        Student("Chiro", 22, 8.0),
        Student("Long", 19, 6.5),
        Student("Nam", 18, 8.0)
    )

//    val kq2 = students.sortedWith(compareByDescending<Student> { it.score }.thenBy { it.age })
    val kq2 = students.sortedWith(compareBy<Student> { it.score }.thenBy { it.age })// tang dan
    println(kq2)

    val name: String = "Chiro"

    name?.let { str ->
        println("Name : $str")
    }

    val result19 = name?.let {
        it.length
    }
    println(result19)

    val lenght = name?.run {
        this.length
    }
    println(lenght)


    val student = Student("Chiro", 22, 9.5)

    val kq3 = student.apply {
        age = 23
    }

    val kq4 = student.run {
        this.age = 26
    }
    println(kq3.toString())

    println(kq4)

}

fun wordCounter() {
    println("Word Counter : entering...")
    val content = readln()
    val wordsMap = mutableMapOf<String, Int>()
    val listWords = content.split(" ")

    for (word in listWords) {
        if (wordsMap.containsKey(word)) {
            wordsMap[word] = wordsMap[word]!!.plus(1)
        } else {
            wordsMap[word] = 1
        }
    }

    for ((wordMap, count) in wordsMap) {
        println("$wordMap ----> $count")
    }

}

fun quanLySinhVien() {
//    ===== QUẢN LÝ SINH VIÊN =====
//    1. Thêm sinh viên
//    2. Xóa sinh viên
//    3. Hiển thị danh sách
//    4. Tìm sinh viên
//    5. Thoát

    val students = mutableListOf<String>()
    while (true) {
        println(
            "===== QUẢN LÝ SINH VIÊN =====\n" +
                    "1. Thêm sinh viên\n" +
                    "2. Xóa sinh viên\n" +
                    "3. Hiển thị danh sách\n" +
                    "4. Tìm sinh viên\n" +
                    "5. Thoát"
        )
        val menuNumber = readln().toIntOrNull()
        when (menuNumber) {
            1 -> addStudent(students)
            2 -> deleteStudent(students)
            3 -> showStudent(students)
            4 -> seachStudent(students)
            5 -> return
        }
    }
}

fun seachStudent(students: MutableList<String>) {
    println("enter name student : ")
    val nameSearch = readln()
    for (student in students) {
        if (nameSearch == student) {
            println("find name student : $student ")
        }
    }

}

fun showStudent(students: MutableList<String>) {
    println("danh sach sv")
    for (s in students) {
        println(s)
    }
}

fun deleteStudent(students: MutableList<String>) {
    println("enter name student : ")
    val name = readln()
    if (students.remove(name)) {
        println("removed student $name")
    }
}

fun addStudent(students: MutableList<String>) {
    println("enter name student : ")
    val name = readln()
    students.add(name)
    println("added student : $name")
}

fun soLanXuatHien() {
    println("Nhap so can tim ")
    val x = readln().toInt()
    var count = 0
    val numbers = intArrayOf(1, 2, 2, 3, 2, 4, 2)

    for (number in numbers) {
        if (number == x) {
            count++
        }
    }
    println("solanxuathien :$count")
}

fun findMaxNumber() {
    val numbers = intArrayOf(5, 2, 9, 1, 7)
    var max = numbers[0]
    for (i in numbers.indices) {
        if (max < numbers[i]) {
            max = numbers[i]
        }
    }
    println("max = $max")
}


fun demNguyenAm(string: String) {
    println("demNguyenAm: $string")
    var count = 0
    for (i in string.length - 1 downTo 0) {
        if (string[i] == 'o' || string[i] == 'a' || string[i] == 'e' || string[i] == 'i' || string[i] == 'u') {
            count++
        }
    }
    println("count : $count")
}

fun reversed(str: String): String {
    var result = ""
    for (i in str.length - 1 downTo 0) {
        result += str[i]
    }
    return result
}

fun fibonacci() {
    println("Nhap n: ")
    val n = readln().toInt()

    var a = 0
    var b = 1

    for (i in 1..n) {
        print("$a ")

        val next = a + b
        a = b
        b = next
    }
}

fun inSoNguyenTo() {
    println("Nhap So Nguyen To ")
    val number = readln().toInt()
    for (i in 2..number) {
        if (isPrime(i)) {
            println("$i")
        }
    }
}

fun isPrime(number: Int): Boolean {
    if (number < 2) return false
    for (i in 2 until number) {
        if (number % i == 0) {
            return false

        }
    }
    return true
}


fun kiemTraSoNguyenTo() {
    println("Nhap so can kiem tra nguyen to :")
    val number = readln().toInt()
    for (i in 2 until number) {
        if (number % i == 0) {
            println("khong phai la so nguyen to")
            return
        }
    }
    println("la so nguyen to ")
}

fun demSoCacChuSo() {
    println("Nhap So nguyen duong ")
    var n = readln().toInt()
    var count = 0
    while (n > 0) {
        count++
        n /= 10
    }

    println(" so luong cac chu so : $count ")
}

fun findMax3Number() {
    val a = 100
    val b = 200
    val c = 100
    var max = a

    if (max < b) {
        max = b
    }
    if (c > max) {
        max = c
    }

    println("so lon nhat la :$max")
}

fun tongCacSoN() {
    println("Nhap So N : ")
    val n = readln().toInt()
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    println("sum = $sum")
}

fun inBangCuuChuong() {
    println("Nhap So N bang cuu chuong : ")
    val n = readln().toInt()
    for (i in 1..10) {
        println("$i*$n = ${n * i}")
    }
}

fun loadURl(linkURl: String, fileName: String) {

    val currentFolder = File(System.getProperty("user.dir"))

    val imageFolder = File(currentFolder, "images")
    imageFolder.mkdirs()
    val file = File(imageFolder, fileName)

    val url = URL(linkURl)
    val connection = url.openConnection() as HttpsURLConnection
    connection.connect()
    if (connection.responseCode == HttpsURLConnection.HTTP_OK) {
        connection.inputStream.use { inputStream ->
            file.outputStream().use {
                inputStream.copyTo(it)
                println(" Load img success ,$it")
            }
        }
    } else {
        print("Load img fail ,")
    }

//    400 → request không hợp lệ
//    401 → chưa xác thực / cần đăng nhập
//    403 → bị từ chối quyền truy cập
//    404 → không tìm thấy file
//    500 → server bị lỗi
//    503 → server tạm thời không hoạt động

}

fun checkAny(list: List<Any>) {
    for (item in list) {
        when (item) {
            is Int -> println("item is int : $item")
            is String -> println("item is string : $item")
            is Float -> println("item is Float : $item")
            else -> println("item failed")
        }
    }
}

class BankAccount(val owner: String, var balance: Double) {

    fun deposit(amount: Double) {
        balance += amount
        println("Deposited $amount")
    }

    fun withdraw(soTien: Double) {
        if (soTien > balance) {
            println("Khong du tien")
        } else {
            balance -= soTien
            println("da rut $soTien")
        }

    }

    fun showBalance() {
        println("Balance: $balance")
        println("Owner: $owner")
    }


}