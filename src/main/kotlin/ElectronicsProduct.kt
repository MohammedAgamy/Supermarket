// Subclass for ElectronicsProduct from parent Product
class ElectronicsProduct (private val name:String,   price: Double , quantity: Int)
    :Product(name ,price, quantity){

    // Implement the abstract method to apply a 10% discount to the price
    override fun getDiscountedPrice(): Double {
        return getPrice() * 10 /100
    }


    // Override the getProductInfo method to include a category label
    override fun getProductInfo(): String {
        return "Category Electronics : ${super.getProductInfo()}"
    }
}