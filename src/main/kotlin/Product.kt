// Define the abstract class
abstract class Product(private val name: String,private var price: Double, quantity: Int) {
    //(get and set create by default and create name  in primary constructor


    //get and set price double type

     fun getPrice ():Double= price
     fun setPrice(value:Double) {
         price =value
     }

    //get and set quantity int Int
    var quantity: Int = quantity
        get() = field
        set(value) {
            field = value
        }

    // create discount fun that will calculate the discounted price for each product
    abstract fun getDiscountedPrice(): Double

    //display info about product like name price quantity
   open fun getProductInfo(): String {
        return "Product Name : $name Price is ${price} and Quantity is $quantity "
    }

}