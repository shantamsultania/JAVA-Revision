
abstract class Shape {

    String name;

    abstract public int area();

}

class rectangle extends Shape {

    private int length;
    private int breath;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public int area() {

        int area = 2 * getLength() * getBreath();

        return area;
    }
}


class square extends Shape {

    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int area() {

        int area = 4 * getSide();
        return area;
    }
}

public class demoAbs {

    public static void main(String[] args) {

        rectangle obj1 = new rectangle();
        obj1.setBreath(10);
        obj1.setLength(20);
        System.out.println(obj1.area());

        square obj2 = new square();
        obj2.setSide(30);
        System.out.println(obj2.area());


    }

}
