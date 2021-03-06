package opgave_3;

public class FixedDiscount implements Discount {
    double amount;
    double originalPrice = 0.0;

    public FixedDiscount(double originalPrice) {
        // TODO Auto-generated constructor stub

        this.originalPrice = originalPrice;
        this.amount = 0;
    }

    private void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public double getDiscountedPrice(double originalPrice) {
        if (originalPrice > 1000) {
            setAmount(250);
        } else {
            setAmount(0);
        }
        return originalPrice - amount;
    }

}
