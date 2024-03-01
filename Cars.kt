import kotlin.math.round

open class Cars (var color:String, var mark:String, var power:Int, var cost:Double){

    open fun Volume_st(volume:Int)
    {
        when (volume){
            2-> println("Слабый мотор")
            1-> println("Обычный мотор")
            3->println("Сильный мотор")
            4->println("Ничего себе")
            5->println("Куда такая мощь")
            else->println("Такого варианта не было")
        }

    }

    open fun Zhiga()
    {
        println("За такую цену можно было купить ${round(cost/30)} жигулей\n\n")
    }

    open fun marc()
    {
        println("Марка машины $mark")
    }
    open fun Get_Info()
    {
        println("Цвет кузова:$color\n" +
                "Мощность мотора:$power л.с.\n Цена:$cost")
    }


}