/*class Words() { // Создание класса
    init{
        println("Класс Words был создан!")}
}
fun main(args: Array<String>) {
    Words()
}*/

/*class Message constructor (username: String) // Работа с классом
{
    var username: String = " "
    init {
        this.username = username
    }
    fun Print(){
        println("Привет, меня зовут ${username}")
    }
}
fun main(){
    val mes = Message(username = readln())
    mes.Print()
}*/

abstract class Animal constructor(val food: String,val locaation: String)
{

    abstract fun makeNoise()
    abstract fun eat()
    fun sleep()
    {
    println(this::class.simpleName + " спит\n")
    }
}
class Dog (food: String, locaation: String,val breed: String) : Animal(food, locaation){
    fun breed()
    {
        println("Порода собаки - ${breed}")
    }
    override fun eat() {
        println("Собака ест ${food}")
    }

    override fun makeNoise() {
        breed()
        println("Её любимое место для выгула - ${locaation}")
    }
}
class Cat (food: String, locaation: String,val toy: String) :Animal(food, locaation){
    fun fav_toy()
    {
        println("Любимая игрушка кота - ${toy}")
    }

    override fun eat() {
        println("Кот ест ${food}")
    }
    override fun makeNoise() {
        fav_toy()
        println("Его любое место - ${locaation}")
    }
}
class Hourse (food: String, locaation: String,val color: String) : Animal(food, locaation){
    fun color(){
        println("У лошади красивая ${color} грива")
    }

    override fun eat() {
        println("Лошадь ест ${food}")
    }

    override fun makeNoise() {
        color()
        println("Лошадь любит бегать в ${locaation}")
    }
}
class Veterinar(){
    fun treatAnimal(animal: Animal){
        println("Кто-то сейчас на обследовании у ветеринара")
        animal.eat()
        animal.makeNoise()
        animal.sleep()
    }
}
fun main()
{
    val veterinar = Veterinar()
    val animals = arrayOf(
        Dog ("мясо", "задний двор", "Леонбергер"),
        Cat ("кошачий сбалансированный корм","верхняя полка шкафа в гостинной","шарик с кошачьей мятой"),
        Hourse ("сено","поле","серебристая")
    )
    for (animal in animals) {
        veterinar.treatAnimal(animal)
    }
}
