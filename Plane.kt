open class Plane
    (var marka:String,
            var place_otpr:String,
            var place_nazn:String,
            var date_otpr:String,
            var time_otpr:String,
            var time_way:String,
            ){
    fun Input(a:Plane){
        a.marka= readLine().toString()
        a.place_otpr= readLine().toString()
        a.place_nazn= readLine().toString()
        a.date_otpr= readLine().toString()
        a.time_otpr= readLine().toString()
        a.time_way= readLine().toString()
    }

    fun Give_Info(a:Plane){
        println("Марка: "+a.marka)
        println("Место отправления: "+a.place_otpr)
        println("Место назначения: "+a.place_nazn)
        println("Дата отправления: "+a.date_otpr)
        println("Время отправения: "+a.time_otpr)
        println("Время в пути: "+a.time_way)
    }
}
