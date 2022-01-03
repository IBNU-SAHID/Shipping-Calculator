fun shippingCost(amount: Double, international: Boolean): Double {
    var fee: Double
    if ( international){
        fee = amount * 0.15
        if (fee > 50){
            fee = 50.0
        }
    }else{
        if (amount < 75 ) {
            fee = amount * 0.1
        }else {
            fee =  0.0
        }
    }
    return fee
}
fun main(args: Array<String>) {
    println("============== Shipping Calculator ==============")
    print("Order Amount : ")
    val total = readLine()!!.toDouble()
    print("International (true/false) : ")
    val  international = readLine()!!.toBoolean()
    println("------------------------------------------------")
    print("Shipping Cost : \$")
    println(shippingCost(total, international))
}