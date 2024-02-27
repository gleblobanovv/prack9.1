class Passagir (var max_vmestimost:Int,marka:String,time_way:String){

    public fun Vmestimost():Int{
        println("Введите максимальное количество пассажирских мест")
        max_vmestimost= readLine()!!.toInt()

        if (max_vmestimost<=0){
            println("Максимальное количество мест не может быть меньше 0")
        }
        else{
            println("Максимаьное количество мест: $max_vmestimost")
        }
        return max_vmestimost
        }
    }

    public fun People_Way(max_vmestimost:Int){
        var people_time_way=2

        if (max_vmestimost<50 && max_vmestimost>1){
            people_time_way=2
            println("Доставка составит: $people_time_way")
        }else{
            if (max_vmestimost>50 && max_vmestimost<100){
                people_time_way=2*3
                println("Доставка составит: $people_time_way")
            }else{
                if (max_vmestimost>=100){
                    people_time_way=2*6
                    println("Доставка составит: $people_time_way")
                }
            }
        }
    }


