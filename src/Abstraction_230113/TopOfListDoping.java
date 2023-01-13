package Abstraction_230113;

public class TopOfListDoping extends Doping {

    public TopOfListDoping(double price) {
        super.setPrice(price);
    }

    @Override

    public double calculate() {
        return super.getPrice() + super.getPrice() * 0.35;
    }

}
