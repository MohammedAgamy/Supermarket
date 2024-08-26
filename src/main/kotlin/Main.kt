fun main(args: Array<String>) {

    // Create instances
    val electronicsObject = ElectronicsProduct("Mobile", 5500.65, 5)
    val groceryObject = GroceryProduct("Milk", 25.65, 10)

    // Create an instance of Supermarket
    val supermarket = Supermarket()
    //use polymorphism to display outPut
    supermarket.displayProduct(electronicsObject)
    supermarket.displayProduct(groceryObject)

}