package MenuCard;

public class Main {

    public static void main(String[] args) {

        Menu menu1 = new Menu();
        Order order1 = new Order();

        //menu1.printMenu();
        order1.addStarters(Starter.CHEESEPLATER);
        order1.addMains(MainCourse.PIZZA);
        order1.addDessert(Dessert.CHEESECAKE);
        order1.printOrder();
        
    }



}
