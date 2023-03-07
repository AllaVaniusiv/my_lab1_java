package ua.lviv.iot.algo.part1.lab1;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class Printer {
    private String model;
    private String type;
    private boolean isColor;
    private boolean isDuplex;
    private int paperTrayCapacity;
    private int paperCount;

    public Printer() {}

    public Printer(String model, String type, boolean isColor, boolean isDuplex, int paperTrayCapacity, int paperCount) {
        this.model = model;
        this.type = type;
        this.isColor = isColor;
        this.isDuplex = isDuplex;
        this.paperTrayCapacity = paperTrayCapacity;
        this.paperCount = paperCount;
    }

    private static Printer instance = new Printer();

    public static Printer getInstance() {
        return instance;
    }

    public void print(int pages) {
        if (pages <= paperCount) {
            paperCount -= pages;
            System.out.println("Printed " + pages + " pages.");
        } else {
            System.out.println("Not enough paper to print " + pages + " pages.");
        }
    }

    public void loadPaper(int count) {
        int newPaperCount = paperCount + count;
        if (newPaperCount > paperTrayCapacity) {
            paperCount = paperTrayCapacity;
            System.out.println("Paper tray is full.");
        } else {
            paperCount = newPaperCount;
            System.out.println(count + " pages added to paper tray.");
        }
    }

    public static void main(String[] args) {
        Printer[] printers = new Printer[4];
        printers[0] = new Printer();
        printers[1] = new Printer("HP DeskJet", "inkjet", true, false, 100, 50);
        printers[2] = Printer.getInstance();
        printers[3] = Printer.getInstance();

        for (int i = 0; i < printers.length; i++) {
            System.out.println("Printer " + i + ": " + printers[i]);
        }
    }
}

