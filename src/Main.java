public class Main {
    public static void main(String[] args) {

        Auditory auditory = new Auditory("Auditoria 1", "West");
        Kitchen kitchen = new Kitchen("Kuhnya", "South");
        Hall hall = new Hall("Hall", "North");
        kitchen.numberOFPlates = 2;
        hall.numberOfSofas = 2;

        Printable[] printables;
        printables = new Printable[]{auditory, kitchen, hall};

        for (Printable item : printables) {
            if (item instanceof GeekTech geekTech) {
                System.out.println(geekTech.getName());
                System.out.println(((GeekTech) item).getLocation());
            }
            if (item instanceof Kitchen kitchen1) {
                System.out.println("Number of plates: " + kitchen.numberOFPlates);
            }
            if (item instanceof Hall hall1) {
                System.out.println("Number of sofas: " + hall.numberOfSofas);
            }
            item.print();
        }


    }

}

