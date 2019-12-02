package MenuCard;

public enum  Dessert {
    TIRAMISSU(6),CHEESECAKE(5),DOPIO(4),CAFEGLACE(8);

    private double price;

    Dessert(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


}
