open class Насекомые (var name: String, var speed: Double, var color:String, var food: String, var habitat: String)
{

    open fun Fly(fly: Int){
        when(fly) {
            1 -> println("Насекомое $name летающее")
            2 -> println("Насекомое $name не летающее")
            else->println("Что-то не так")
        }
    }
    open fun Food_class(){
        println("$name питается: $food")
        }

    open fun GetInfo(){
        println("Информация о насекомом")
        println("Насекомое:$name\n Скорость:$speed\n Расцветка:$color\n Среда обитания:$habitat")
    }

}
