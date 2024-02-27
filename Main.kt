fun main(){
    var plane=Plane(
        "boing",
        "Екатеринбург",
        "Москва",
        "27-02-2024",
        "20:00",
        "2 часа")

    plane.Input(plane)
    plane.Give_Info(plane)

    var gruz=Gruz(
        400.0,
        "Boing",
        "2 часа"
    )
    gruz.Max_wes(0.0)
    gruz.Delivery(2.0)

    var passagir=Passagir(
        "52",
        "boing",
        "2 часа"
    )
    passagir.Vmestimost()
    passagir.People_Way("")
}