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
    protected ShoppingCart cart;
    protected int orderNumber;

    
    public OrderConfirmation(ShoppingCart cart){
        this.cart = cart;
        randomOrderNumber();
        
    }
    private int randomOrderNumber() {
        Random random = new Random();
        this.orderNumber = 1000 + random.nextInt(10000);
        return this.orderNumber;
    }
    
    public int getOrderNumber(){
        return orderNumber;
    }
    
    public void orderConfirmation(){ 
        if (cart.cartItems.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Your cart is empty. Please add items before confirming your order.");
    } else {
        JOptionPane.showMessageDialog(null, "Order Confirmation: " + "\nOrder Number: " + orderNumber + "\n");
        cart.viewCart();
        JOptionPane.showMessageDialog(null, "The total price of your purchase is: €" + cart.calculateTotalPrice() + "\nThank your for your purchase and thank you for supporting Sustainability!");
    
        }
    }
}
