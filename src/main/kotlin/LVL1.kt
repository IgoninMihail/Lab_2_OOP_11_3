open class LVL1(var name:String,var population:Int,var percents:Double,var Q:Double) {
    open fun function(){
        println("Введите численность:")
        population = readln().toInt()
        println("Введите процент голосов на последних выборах:")
        percents = readln().toDouble()
        Q = 0.3*population+0.7*percents
        println("Q:$Q")
    }
}