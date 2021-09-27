public class Main {

    public static void main(String[] args) {

        Printer printer = new LaserPrinter();
        Printer printer1 = new OldPrinter();

        System.out.println(printer.print());
        System.out.println(printer1.print());


    }
}
