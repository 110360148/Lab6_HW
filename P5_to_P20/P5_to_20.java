public class P5_to_20 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        car1.num = 1234;
        car1.gas = 20.5;

        Car car2;
        car2 = new Car();

        car2.num = 2345;
        car2.gas = 30.5;

        System.out.println("car1汽車是" + car1.num);
        System.out.println("car1汽油量是" + car1.gas);

        System.out.println("car2汽車是" + car2.num);
        System.out.println("car2汽油量是" + car2.gas);

        car1.show();

        car1.showCar();

        car1.setNum(6789);
        car1.setGas(15.5);

        int number = 1234;
        double gasoline = 20.5;

        car1.setNumGas(number, gasoline);

        number = car1.getNum();
        gasoline = car1.getGas();
        System.out.println("調查樣品車時得知");
        System.out.println("車號是" + number + "汽油量是" + gasoline);

        car1.num = 6789;
        car1.gas = -10;
        car1.show();
    }
}

class Car {
    int num;
    double gas;

    void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }

    void showCar() {
        System.out.println("開始顯示車子資料");
        show();
    }

    void setNum(int n) {
        num = n;
        System.out.println("將車號設為" + num);
    }

    void setGas(double g) {
        gas = g;
        System.out.println("將汽油量設為" + gas);
    }

    int getNum() {
        System.out.println("調查車號");
        return num;
    }

    double getGas() {
        System.out.println("調查汽油量");
        return gas;
    }

    void setNumGas(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "汽油量設為" + gas);
    }
}