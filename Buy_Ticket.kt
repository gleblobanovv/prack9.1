open class Buy_Ticket(var klass_plane:String){

    fun Buy_Ticket(klass_plane1:String){
        klass_plane= readLine()!!.toString()
         when(klass_plane)  {
            "эконом" -> 12000
            "бизнес" -> 50000
            "первый" -> 140000
         }
        when(klass_plane!="эконом"||klass_plane!="бизнес"||klass_plane!="первый"){
            true->("Не верный класс")
            false->return
        }
    }



}