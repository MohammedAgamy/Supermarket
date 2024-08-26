// Supermarket class to display result
class Supermarket {
    // Method to display product details and discounted price
    fun displayProduct(product: Product){
        println("Product Information ${product.getProductInfo()}")
        println("Discounted Price: ${product.getDiscountedPrice()}")
        println("Price After Discounted : ${  product.getPrice()- product.getDiscountedPrice()}  ")

    }
}