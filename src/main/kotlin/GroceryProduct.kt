
//Inherit from the Product class
class GroceryProduct(private val name:String,var price1: Double, quantity: Int)
    :Product(name ,price1, quantity) {

    //Implement the getDiscountedPrice() method to
    //apply a 5% discount to the price
    override fun getDiscountedPrice(): Double {
        return getPrice() * 5 / 100
    }

    // Override the getProductInfo() method to include a
    // category label (e.g., "Category: Grocery")
    override fun getProductInfo(): String {
        return "Category  Grocery : ${super.getProductInfo()}"
    }
}