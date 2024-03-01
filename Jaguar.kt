import Cars.*
import kotlin.math.round

class Jaguar(empColor:String, empMark:String, empPower:Int, empCost:Double ):Cars(empColor,empMark,empPower,empCost) {
    private var model=""

    fun Set_model(model:String)
    {
        this.model=model
    }

    fun  Get_model(): String {
        return model
    }


    override fun marc()
    {
        println("Машина марки Jaguar")
    }

    override fun Get_Info()
    {
        println("Jaguar модели ${Get_model()}\nЦвет кузова:$color\nМощность мотора:$power л.с.\n\n")
    }

    override fun Zhiga() {
        println("За цену этого ягуара можно было купить ${round(cost/30)} жигулей")
    }
}