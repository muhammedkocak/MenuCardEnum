package MenuCard;

public enum  Starter {
    BRUSHETTA(5),CHEESEPLATER(7),BURATTA(6);

    private double price;

    Starter(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


}
