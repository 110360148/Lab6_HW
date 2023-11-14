import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P36_to_P51 {
    public static void main(String[] args) throws IOException {
        String str = "Hello";
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        int len = str.length();
        System.out.println(str + "的第一個字元是" + ch1);
        System.out.println(str + "的第二個字元是" + ch2);
        System.out.println(str + "的長度是" + len);

        System.out.println("請輸入英文字母");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String stru = str1.toUpperCase();
        String strl = str1.toLowerCase();
        System.out.println("轉換成大寫時為" + stru);
        System.out.println("轉換成小寫時為" + strl);

        System.out.println("請輸入字串");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String str2 = br1.readLine();
        System.out.println("請輸入要檢索的文字");
        String str3 = br1.readLine();
        char ch = str3.charAt(0);
        int num0 = str2.indexOf(ch);
        if(num0 != -1) {
            System.out.println(str2 + "的第" + (num0 + 1) + "個字就是\"" + ch + "\"");
        } else {
            System.out.println(str2 + "中沒有\"" + ch + "\"這個字");
        }

        System.out.println("請輸入字串");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String str4 = br2.readLine();
        System.out.println("請輸入要新增的字串");
        String str5 = br2.readLine();
        StringBuffer sb = new StringBuffer(str4);
        sb.append(str5);
        System.out.println("在\"" + str4 + "\"後新增\"" + str5 + "\"的話，就會變成\"" + sb + "\"。");

        System.out.println("請輸入兩個整數");
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        String str6 = br3.readLine();
        String str7 = br3.readLine();
        int num1 = Integer.parseInt(str6);
        int num2 = Integer.parseInt(str7);
        int ans = Math.max(num1, num2);
        System.out.println(num1 + "與" + num2 + "中較大的是" + ans);

        System.out.println("宣告car1");
        Car car1 = new Car();
        car1.setCar(1234, 20.5);
        System.out.println("宣告car2");
        Car car2;
        System.out.println("將car1指定給car2");
        car2 = car1;
        System.out.println("car1的");
        car1.show();
        System.out.println("car2的");
        car2.show();
        System.out.println("改變car1的相關資料");
        car1.setCar(2345, 30.5);
        System.out.println("car1的");
        car1.show();
        System.out.println("car2的");
        car2.show();

        Car car3;
        car3 = new Car();
        car3.show1();
        int number = 1234;
        double gasoline = 20.5;
        String str8 = "1號車";
        car3.setCar(number, gasoline);
        car3.setName(str8);
        car3.show1();

        Car[] cars;
        cars = new Car[3];
        for(int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
        }
        cars[0].setCar(1234, 20.5);
        cars[1].setCar(2345, 30.5);
        cars[2].setCar(3456, 40.5);
        for (int i = 0; i < cars.length; i++) {
            cars[i].show();
        }
    }
}

class Car {
    private int num;
    private double gas;
    private String name;

    public Car() {
        num = 0;
        gas = 0.0;
        name = "沒有名稱";
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "汽油量設為" + gas);
    }

    public void setName(String nm) {
        name = nm;
        System.out.println("將車名設為" + name);
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }

    public void show1() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
        System.out.println("車名是" + name);
    }
}
