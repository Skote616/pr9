import Cars.*
import kotlin.math.round

class Dodge(empColor:String, empMark:String, empPower:Int, empCost:Double ):Cars(empColor,empMark,empPower,empCost) {
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
        println("Машина марки Dodge")
    }

    override fun Get_Info()
    {
        println("Dodge модели ${Get_model()}\nЦвет кузова:$color\nМощность мотора:$power л.с.\n" +
                " Цена:$cost")
    }

    override fun Zhiga() {
        println("За цену этого доджа можно было купить ${round(cost/30)} жигулей\n\n")
    }

}