package linkedlist_jf;

/**
 *
 * @author flyasth3sky
 */

public class TrainCar {

    //  length of the train car
    final private double length;
    //  weight in tons
    final private double weight;
    //  holds a ProductLoad
    private ProductLoad load;
    
    //  constructors
    TrainCar (double length, double weight, ProductLoad load) {
        this.length = length;
        this.weight = weight;
        this.load = load;
    }
    
    TrainCar (double length, double weight) {
        this.length = length;
        this.weight = weight;
    }
    
    //  isEmpty() method
    public boolean isEmpty() {
        if (getLoad() == null) 
            return true;
        return false;
        
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @return the load
     */
    public ProductLoad getLoad() {
        return load;
    }

    /**
     * @param load the load to set
     */
    public void setLoad(ProductLoad load) {
        this.load = load;
    }
    
}
