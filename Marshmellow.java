public class Marshmellow extends Sweet{
    double size;

    public Marshmellow(String name, double weight, double price, double size) {
        super(name, weight, price);
        this.size = size;
    }

   @Override
    public String toString() {
        return super.toString()+
                "Размер = " + size +";"+"\t";
    }
}
