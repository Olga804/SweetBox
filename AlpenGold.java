public class AlpenGold extends Sweet{
    String schmekt;

    public AlpenGold(String name, double weight, double price, String schmekt) {
        super(name, weight, price);
        this.schmekt = schmekt;
    }

    @Override
    public String toString() {
        return "\nAlpenGold:" +"\n"+"\t"+
                "Вкус = " + schmekt + ";"+"\t" +
                "Вес = " + weight +";"+"\t"+
                "Цена = " + price ;

    }
}

