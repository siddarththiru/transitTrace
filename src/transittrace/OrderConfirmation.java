/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transittrace;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author murph
 */
class OrderConfirmation extends ShoppingCart {
    //declaring variables 
    protected ShoppingCart cart;
    protected int orderNumber;

    //constructor
    public OrderConfirmation(ShoppingCart cart){
        this.cart = cart;
        this.orderNumber = randomOrderNumber();
    }
    
    //methods
    private int randomOrderNumber() {
        Random random = new Random();
        return 1000 + random.nextInt(10000);
    }
    
    public int getOrderNumber(){
        return orderNumber;
    }
    
    public void orderConfirmation(){ 
        if (cart.cartItems.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Your cart is empty. Please add items before confirming your order.");
    } else {
            cart.viewCart();
            JOptionPane.showMessageDialog(null,"\nOrder Confirmation Number: " + orderNumber + "\nThe total price of your purchase is: €" + cart.calculateTotalPrice() + "\nThank you for supporting Sustainability!");
        }
    }
}
