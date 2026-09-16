public class prisBeregner {

    double applyDiscount(double price, double discountPercent) {
        return price - (price * discountPercent / 100);
    }

    double addTax(double price) {
        return price* 1.25;
    }

    double calculateFinalPrice(double basePrice, double discount) {
        double priceAfterDiscount = applyDiscount(basePrice, discount);
        double finalPrice = addTax(priceAfterDiscount);
        return finalPrice;
    }

    void main() {
        double finalPrice = calculateFinalPrice(500, 20);
        System.out.println("Final price: " + finalPrice);

    }

}
