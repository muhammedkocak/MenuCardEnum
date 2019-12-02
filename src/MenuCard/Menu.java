package MenuCard;

import java.util.Arrays;

public class Menu {
    private Starter[] starters = Starter.values();
    private MainCourse[] mains = MainCourse.values();
    private Dessert[] dessert = Dessert.values();


    public void printMenu() {
        System.out.println("***Starters***");
        for (Starter s : starters) {
            System.out.println(s + " " + s.getPrice());
        }
        System.out.println("***Mains***");
        for (MainCourse m : mains) {
            System.out.println(m + " " + m.getPrice());
        }
        System.out.println("***Desserts***");
        for (Dessert d : dessert) {
            System.out.println(d + " " + d.getPrice());

        }

    }
}

