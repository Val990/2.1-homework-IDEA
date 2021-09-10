public class Main {

    public static void main(String[] args) {
        int ticketAmount = 1_000;
        int rublesFor1Mile = 20;
        int bonusMiles = ticketAmount / rublesFor1Mile;
        System.out.println("Бонусные мили:" + bonusMiles);
    }
}

