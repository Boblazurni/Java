// Файл для Заданий 7-8: Класс Journal
public class Journal implements Printable {
    private String name;
    
    public Journal(String name) {
        this.name = name;
    }
    
    @Override
    public void print() {
        System.out.printf("Журнал '%s'\n", name);
    }
    
    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Journal) {
                item.print();
            }
        }
    }
    
    public String getName() { return name; }
}