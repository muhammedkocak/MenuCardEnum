package MenuCard;

public enum  MainCourse {
    PIZZA(5),PENNE(7),LASAGNA(6);

    private double price;

    MainCourse(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


}
