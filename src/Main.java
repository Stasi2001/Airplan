public class Main {
    public static void main(String[] args) {
      //  Plane[] arrayPlanes

        Object a1 = new Object();
        String s1 = a1.toString();
        System.out.println(s1);
        System.out.println(a1);
        Airplane a2 = new Airplane("Airbus A320", ",белый", 135);
        Airplane a3 = new Airplane("Boeing 777-300ER", "черный", 0.168);
        System.out.println(a2);
        System.out.println(a3);

        a2.setName("Просто супермариновый");
        a2.setColor("серобуромалиновый");

        a3.setWeight(9.1);
        System.out.println(a3);
        System.out.println("вес самолета " + a3.getWeight());
    }
}

class Airplane {
    String name;
    String color;
    double wingload;    //нагрузка на крыло
    double weight;

    public void setWeight(double weight) {
        if (weight > 0)
            this.weight = weight;
    }
    public double getWeight() {
        System.out.println("измеряем вес самолета");
        return weight;
    }


    public Airplane(String name, String color, double wingload) {
        this.name = name;
        this.color = color;
        this.wingload = wingload;

    }
    public String toString() {
        String s = "Самолет: " + name + " " + color + " с нагрузкой на крыло " + wingload + " кг/м^2";
        return s;
    }
    public void setName(String name) {
        System.out.println("переименовываем " + this.name + " в " + name);
        this.name = name;
    }
    public void setColor(String color) {
        System.out.println("перекрашиваем " + this.name + " в " + color);
        this.name = name;
    }


}