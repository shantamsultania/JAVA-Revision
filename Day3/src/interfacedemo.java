public class interfacedemo {

    public static void main(String[] args) {

        Printer printer = new LaserPrinter();
        Printer printer1 = new OldPrinter();

        System.out.println(printer.print());
        System.out.println(printer1.print());

    }
}


interface Printer {
    String print();
}

class OldPrinter implements Printer{

    public String print(){
        return "old printer printing";
    }
}


class LaserPrinter implements Printer {

    public String scanning(){
        return "scanning now ";
    }
    public String print(){
        return "Laser Printer Printing";
    }
}
