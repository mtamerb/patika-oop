package Abstraction;


public class TopOfListDoping extends Doping {


    public TopOfListDoping() {
        super.setPrice(price);
    }

    @Override
    public double calculate() {
        return super.getPrice() + super.getPrice() * 0.35;
    }

}

