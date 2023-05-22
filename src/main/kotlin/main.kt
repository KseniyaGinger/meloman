fun main () {

    var discount = 0
    var price = 1300
    var addDiscount = 0
    val isRegularCostumer = true

    when (price) {
        in 0..1000 -> "no discount"
        in 1000..10000 -> discount = 100
        in 10000..Int.MAX_VALUE -> discount = ((price * 0.05).toInt())
    }

    if (isRegularCostumer) {
        addDiscount += ((price - discount) * 0.01).toInt()
    }

    var totalPrice = price - discount - addDiscount
    println("amount without discount: $price")
    println("discount: $discount + $addDiscount")
    println("total price: $totalPrice")
}




