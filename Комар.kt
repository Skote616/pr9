import Насекомые.*

class Комар(var character: String, empName: String, empSpeed: Double, empFood: String, empColor: String, empHabitat: String):Насекомые(empName, empSpeed, empFood,empColor, empHabitat) {
   private var bit=""
    fun Set_bit(bit:String)
    {
        this.bit=bit
    }

    fun Get_bit():String
    {
        return bit
    }

    override fun Fly(fly: Int){
        when(fly) {
            1-> println("Комар - летающий\n")
            2 -> println("Кто-то оторвал крылья комару...\n")
            else->println("Что-то не так")
        }
    }
    override fun Food_class(){
        println("$name питается $food\n")
    }
    fun Bit()
    {
       println("Наш комар ${Get_bit()} людей\n")
    }

    override  fun GetInfo(){
        println("Информация о насекомом\n")
        println("Насекомое:$name\n Скорость:$speed\n Расцветка:$color\n Среда обитания:$habitat")
    }
}