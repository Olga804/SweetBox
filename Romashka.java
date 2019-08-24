public class Romashka extends Sweet {
    String color;

    public Romashka(String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nRomashka:" +"\n"+"\t"+
                "Цвет = " + color + ";"+'\t' +
                "Вес = " + weight + ";"+"\t"+
                "Цена = " + price;
    }
}
