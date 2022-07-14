package Abstraction;

public class UptodateDoping extends Doping {

    public UptodateDoping(double price, double[] taxes) {
        super.setPrice(price);
        super.setTaxes(taxes);
    }

    @Override
    public double calculate() {
        return calculateTaxes() + commisionRate();
    }

    private double calculateTaxes() {
        double totalTaxValue = 0;
        for (int i = 0; i < super.getTaxes().length; i++) {
            totalTaxValue += super.getTaxes()[i];
        }
        return totalTaxValue;
    }

    private double commisionRate() {
        return super.getPrice() * 0.2;
    }
}
