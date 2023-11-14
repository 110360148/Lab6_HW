public class P22_to_P24 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        car1.setNumGas(1234, 20.5);
        car1.show();

        System.out.println("指定不正確的汽油量{-10.0}看看");

        car1.setNumGas(6789, -10.0);
        car1.show();

        System.out.println("只變更車號");
        car1.setCar(2345);
        car1.show();

        System.out.println("只變更汽油量");
        car1.setCar(30.5);
        car1.show();
    }
}

class Car {
    private int num;
    private double gas;

    public void setNumGas(int n, double g) {
        if (g>0 && g<100) {
            num = n;
            gas = g;
            System.out.println("將車號設為" + num + "汽油量設為" + gas);
        } else {
            System.out.println(g + "不是正確的汽油量");
            System.out.println("無法變更汽油量");
        }
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }

    public void setCar(int n) {
        num = n;
        System.out.println("將車號設為" + num);
    }

    public void setCar(double g) {
        gas = g;
        System.out.println("將汽油量設為" + gas);
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "汽油量設為" + gas);
    }
}