package linkedlist_jf;

/**
 * A ProductLoad represents a product (cargo) that is be delivered to a destination.
 * 
 * @author flyasth3sky
 */
public class ProductLoad {
    
    private String prodName;  //  name of the product
    
    private double weight;  //  weight of the product in tons
    
    private double value;  //  value of the product in dollars
    
    private boolean dangerous;  //  indicates whether the product is a dangerous 
                                //  or hazardous material
    
    /**
     * Initializes a ProductLoad with a name, weight, value and indicates whether
     * it is dangerous or not.
     * @param prodName
     *      The name of the product.
     * @param weight
     *      The weight of the product in tons.
     * @param value
     *      The value of the product in dollars.
     * @param dangerous
     *      Indicates whether this a dangerous or hazardous product.
     */
    ProductLoad (String prodName, double weight, double value, boolean dangerous) {
        this.prodName = prodName;
        this.weight = weight;
        this.value = value;
        this.dangerous = dangerous;
    }
    
    ProductLoad () {
        
    }

    /**
     * Returns the name of the product.
     * @return 
     *      The name of the product as a String.
     */
    public String getProdName() {
        return prodName;
    }

    /**
     * Returns the weight of the product.
     * @return 
     *      The weight of the product in tons.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Returns the value of the product.
     * @return 
     *      The value of the product in dollars.
     */
    public double getValue() {
        return value;
    }

    /**
     * Indicates whether the product is dangerous or not.
     * @return
     *      True if the product is dangerous or hazardous.  False if it is a safe
     * product.
     */
    public boolean isDangerous() {
        return dangerous;
    }

    /**
     * Changes the name of the product to the one passed in as an argument.
     * @param prodName 
     *      The new name of the product.
     */
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    /**
     * Changes the weight of the product to the one passed in as an argument.
     * @param weight 
     *      The new weight of the product.
     */
    public void setWeight(double weight) {
        if (weight < 0)
            throw new IllegalArgumentException("Argument cannot be negative");
        this.weight = weight;
    }

    /**
     * Changes the value of the product to the one passed in as an argument.
     * @param value 
     *      The new value of the product.
     */
    public void setValue(double value) {
        if (weight < 0)
            throw new IllegalArgumentException("Argument cannot be negative");
        this.value = value;
    }

    /**
     * Changes whether the product is dangerous or not.
     * @param dangerous 
     *      If the product is dangerous set to true.  Set to false if the product 
     * is safe.
     */
    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }
    
    
}
