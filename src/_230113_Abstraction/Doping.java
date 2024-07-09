package _230113_Abstraction;

public abstract class Doping extends MainDoping {
    protected double price;
    protected double[] taxes;

    public double[] getTaxes() {
        return taxes;
    }

    public void setTaxes(double[] taxes) {
        this.taxes = taxes;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // abstraction method

    public abstract double calculate();

}
