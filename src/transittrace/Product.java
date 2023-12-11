/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transittrace;

/**
 *
 * @author murph
 */
class Product extends ProductCategory {
    //declare variables 
    protected String productName;
    protected String productDescription;
    protected double productPrice;

    //constructor
    public Product(String categoryName, String productName, String productDescription, Double productPrice) {
        super(categoryName);
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
       
    }
    
    //getters and setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    
    //methods
    public String getProductDetails(){
        return "Product:" + productName + "\nDescription:" + productDescription + "\nPrice:" + productPrice;
    }
    
    //Override methods
    @Override
    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


}
