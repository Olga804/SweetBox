public class Main {
    public static void main(String [] args){
    Box box = new PresentBox();

    box.add(new Romashka("Romashka",5,10,"red"));
    box.add(new Romashka("Romashka",5,10,"green"));
    box.add(new Romashka("конфета",4.9,10.2,"красный"));
    box.add(new AlpenGold("Шоколадка",95,72.90,"Oreo"));
    box.add(new Marshmellow("Зефирка в шоколаде",17.6,33,3.4));
    box.add(new Marshmellow("Розовая зефирка",30,27,3));


    System.out.println(box.getBoxPrice());
    System.out.println(box.getBoxWeight());
    box.printBox();
    box.optimizeWeight(100);
    box.printBox();


    }
}
