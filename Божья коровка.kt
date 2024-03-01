import Насекомые.*

class `Божья коровка`(var character: String, empName: String, empSpeed: Double,empFood: String, empColor: String,  empHabitat: String):Насекомые(empName, empSpeed, empFood,empColor, empHabitat) {
    private var dots=10

    fun Get_dots():Int
    {
        return dots
    }
    fun Set_dots(dots:Int)
    {
        if(dots>22)
        {println("Столько точек не может быть\n")}
        else
        {this.dots=dots}
    }


    override fun Fly(fly: Int){
        when(fly) {
            1 -> println("\nБожья коровка - летающая")
            2 -> println("\nКто-то оторвал крылышки божьей коровке...")
            else->println("Что-то не так")
        }

    }
    override fun Food_class(){
        println("$name питается $food\n")
    }

    override fun GetInfo(){
        println("Информация о божьей коровке\n")
        println("$name\n Скорость:$speed\n Её расцветка:$color\n Количество точек на спинке:${Get_dots()}\nСреда обитания:$habitat\n")
    }
}