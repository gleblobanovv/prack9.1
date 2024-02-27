class Gruz (var max_ves:Double,marka:String,time_way:String){
    public fun Max_wes(max_ves: Double):Double{
        println("Напишите максимальную грузоподъемность")
        var max_ves= readLine()!!.toDouble()

        if(max_ves<=0){
            println("Максимальная грузоподъемность не может быть меньше 0")
        }
        else{
            println("Максимаьная грузоподъемность: $max_ves")
        }
        return max_ves
    }

    public fun Delivery(max_ves:Double){
        var delivery=2

        if (max_ves<300 && max_ves>1){
            delivery=2
            println("Доставка составит: $delivery")
        }else{
            if (max_ves>300 && max_ves<600){
                delivery=2*3
                println("Доставка составит: $delivery")
            }else{
                if (max_ves>600){
                    delivery=2*6
                    println("Доставка составит: $delivery")
                }
            }
        }

    }





}