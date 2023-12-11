/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transittrace;

/**
 *
 * @author murph
 */

// Superclass
class ProductCategory {
    //declare variables 
    protected String categoryName;

    //constructor
    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }
    
    //getters and setters
    public String getCategoryName() {
        return categoryName; 
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
