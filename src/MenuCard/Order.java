package MenuCard;

import java.util.Arrays;

public class Order {

    private Starter [] starters = new Starter[0];
    private MainCourse [] mains = new MainCourse[0];
    private Dessert [] desserts = new Dessert[0];

    private double orderTotal;


    public void addStarters(Starter starter){
        starters = Arrays.copyOf(starters,starters.length+1);
        starters[starters.length-1]= starter;
    }

    public void addMains(MainCourse mainCourse){
        mains = Arrays.copyOf(mains,mains.length+1);
        mains[mains.length-1]= mainCourse;
    }

    public void addDessert(Dessert dessert){
        desserts = Arrays.copyOf(desserts,desserts.length+1);
        desserts[desserts.length-1]= dessert;
    }
    public void printOrder() {
        double total = 0;
        for (Starter s : starters) {
            System.out.println(s + " " + s.getPrice());
            total += s.getPrice();
        }
        for (MainCourse m : mains) {
            System.out.println(m + " " + m.getPrice());
            total += m.getPrice();
        }
        for (Dessert d : desserts) {
            System.out.println(d + " " + d.getPrice());
            total += d.getPrice();
        }
        System.out.println("Total =" + " € " + total);

    }



}
