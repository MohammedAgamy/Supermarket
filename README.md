# Supermarket Product Management

## Overview

This Kotlin project demonstrates object-oriented programming concepts such as inheritance, polymorphism, and abstraction. The project simulates a simple supermarket product management system, where different types of products (e.g., groceries, electronics) are handled through a unified interface.

## Features

- **Abstract Class `Product`:**
  - Defines common properties like `name`, `price`, and `quantity`.
  - Includes an abstract method `getDiscountedPrice()` to be implemented by subclasses.
  - Provides a method `getProductInfo()` to retrieve basic product information.

- **GroceryProduct Class:**
  - Inherits from `Product`.
  - Applies a 5% discount on the price.
  - Overrides the `getProductInfo()` method to include a "Grocery" category label.

- **ElectronicsProduct Class:**
  - Inherits from `Product`.
  - Applies a 10% discount on the price.
  - Overrides the `getProductInfo()` method to include an "Electronics" category label.

- **Supermarket Class:**
  - Contains a `displayProduct()` method that takes a `Product` object and displays its information and discounted price.
  - Demonstrates polymorphism by handling different product types through the same interface.

## How to Run

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/yourusername/supermarket-product-management.git
