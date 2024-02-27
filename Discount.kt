class Discount(var ticket:Double,var klass_plane:String) {

    fun Discount_Ticket(ticket1: String) {
        var final_price:Double
        var discount:Double
        var price:Int
        when (ticket1) {
            "эконом" -> {
                price = 12000
                discount = 0.03
                final_price= price - (price * discount)
                println("Цена билета со скидкой: $final_price")
            }

            "бизнес" -> {
                price = 50000
                discount = 0.05
                final_price = price - (price * discount)
                println("Цена билета со скидкой: $final_price")
            }

            "первый" -> {
                price = 140000
                discount = 0.10
                final_price = price - (price * discount)
                println("Цена билета со скидкой: $final_price")
            }
            else -> println("Неверно указан класс билета")
        }
    }
}