class LVL2(private var P:Int): LVL1("",0,0.0,0.0) {
    fun function2(population:Int,Q:Double){
        println("Введите численность партии в прошлом году: ")
        P = readln().toInt()
        if(P>population){
            val Qp:Double = Q*0.8
            println("Qp:$Qp")
        }
        else if(P<population){
            val Qp:Double = Q*1.2
            println("Qp:$Qp")
        }
    }
}
