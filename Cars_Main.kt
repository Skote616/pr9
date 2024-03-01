import Cars.*

fun main(){
    var dodge = Dodge("Синий", "Dodge", 150, 1500000.0)
    println("Введите модель Dodge")
    var model= readLine()!!.toString()
    println("Введите объем двигателя Dodge")
    var volume= readLine()!!.toInt()
    dodge.Volume_st(volume)
    dodge.Set_model(model)
    dodge.marc()
    dodge.Get_Info()
    dodge.Zhiga()
    var jaguar = Jaguar("Серый", "Jaguar", 210, 2100000.20)
    println("Введите модель Jaguar")
    model= readLine()!!.toString()
    jaguar.Set_model(model)
    println("Введите объем двигателя Dodge")
    volume= readLine()!!.toInt()
    jaguar.Volume_st(volume)
    jaguar.marc()
    jaguar.Get_Info()
    jaguar.Zhiga()

    var Car1=Cars("Белый","Lada", 90, 1800000.0)
    Car1.marc()
    Car1.Get_Info()
    Car1.Zhiga()
}