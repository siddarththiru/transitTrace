/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transittrace;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author murph
 */
class ShoppingCart {
    protected ArrayList<Product> cartItems;
    protected double totalPrice;


    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addItem(Product product) {
        // Implement the logic to add an item to the cart
        cartItems.add(product);
        JOptionPane.showMessageDialog(null, product.getProductName() + " has been added to your cart.");
    }

    public int removeItem(Product product) {
    int removedCount = 0;

    // Remove all occurrences of the specified product
    while (cartItems.remove(product)) {
        removedCount++;
    }

    // Call the updateCart method after removing items
    

    return removedCount;
}
    

    public void  viewCart() {
        // Implement the logic to view the items in the cart
        StringBuilder details = new StringBuilder("Here are the items in your cart: \n");
    for (Product product : cartItems) {
        details.append(product.getProductName());
        
               details.append(" - €").append(product.getProductPrice()).append("\n");
    }
    JOptionPane.showMessageDialog(null, details.toString());
    
    }
    
    public void updateCart() {
        
        JOptionPane.showMessageDialog(null, "There are " + cartItems.size()+ " items in your shoppingCart");
    }
 

    public double calculateTotalPrice() {
        this.totalPrice = 0;
        
        for(Product product : cartItems){
            this.totalPrice += product.getProductPrice();
        }
        return totalPrice;
    }
    
    
    
}
