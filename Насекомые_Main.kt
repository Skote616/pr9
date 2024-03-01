import Насекомые.*

fun main(){
    try{
        var komar = Комар("Бесячий",  "Комар", 2.4, "Черный", "Кровь", "Городская местность")
        println("Комар летает? 1. Да  2.Нет")
        var fly = readLine()!!.toInt()
        println("Комар кусал людей?")
        var bit = readLine()!!.toString()
        komar.Set_bit(bit)
        komar.Bit()
        komar.Fly(fly)
        komar.GetInfo()
        komar.Food_class()
        var korovka = `Божья коровка`("Красивая", "Божья коровка", 30.1, "Красная", "Мелкие насекомые", "Природа")
        println("Божья коровка летает? 1. Да  2.Нет")
        fly = readLine()!!.toInt()
        println("Введите количество точек на спинке")
        var dots = readLine()!!.toInt()
        korovka.Set_dots(dots)
        korovka.Fly(fly)
        korovka.GetInfo()
        korovka.Food_class()

        var bukashka=Насекомые("Жук-навозник",7.2, "Жёлто-коричнивый", "Экскременты травоядных животных", "Лес")
        bukashka.GetInfo()
        bukashka.Food_class()
    }catch(e:Exception){
        println("Ошибка")}
}