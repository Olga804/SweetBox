import java.util.Arrays;

public class PresentBox implements Box {
  private Sweet[] sweets=new Sweet[0];



    @Override
    public void add(Sweet sweet) {
        if (sweet!=null) {
            sweets = Arrays.copyOf(sweets, sweets.length+1);
            sweets[sweets.length-1]=sweet;
        }
    }

    @Override
    public double getBoxWeight() {
        double sum=0;
        for(int i=0;i<sweets.length;i++){
            sum+=sweets[i].weight;
        }
        return sum;
    }

    @Override
    public double getBoxPrice() {
        double sum=0;
        for(int i=0;i<sweets.length;i++){
            sum+=sweets[i].price;
        }
        return sum;
    }

    @Override
    public void delete(int index) {
        if(index<sweets.length&&index>=0) {
            for (int i = index; i < sweets.length - 1; i++) {
                sweets[i] = sweets[i + 1];

            }
            sweets = Arrays.copyOf(sweets, sweets.length - 1);
        } else if(index>=sweets.length){
            System.out.println("Элемента с таким индексом не существует");

        } else {
            System.out.println("Введён некорректный индекс для удаления элемента");
        }


    }

    @Override
    public void optimizeWeight(double maxWeight) {
        if(maxWeight>0){

            while (getBoxWeight()>maxWeight) {

                int index = 0;
                boolean sorted=true;
                while (sorted){
                    sorted=false;
                    for(int i=0;i<sweets.length-1;i++){
                        if(sweets[i].weight>sweets[i+1].weight){
                            Sweet a=sweets[i+1];
                            sweets[i+1]=sweets[i];
                            sweets[i]=a;
                            sorted=true;
                        }
                    }
                }

                if (sweets.length==2){
                    if(sweets[1].weight>maxWeight&&sweets[0].weight<maxWeight){
                        index=1;
                    }
                }

                delete(index);
            }
            System.out.println("Вес оптимизирован:");


        } else{
            System.out.println("Некорректное значение максимального веса");
        }
    }

    @Override
    public void optimizePrice(double maxPrice) {
        if (maxPrice > 0) {
            while (getBoxPrice() > maxPrice) {
                int index = 0;
                boolean sorted = true;
                while (sorted) {
                    sorted = false;
                    for (int i = 0; i < sweets.length - 1; i++) {
                        if (sweets[i].price > sweets[i + 1].price) {
                            Sweet a = sweets[i + 1];
                            sweets[i + 1] = sweets[i];
                            sweets[i] = a;
                            sorted = true;
                        }
                    }
                }

                if (sweets.length == 2) {
                    if (sweets[1].price > maxPrice && sweets[0].price < maxPrice) {
                        index = 1;
                    }
                }

                delete(index);
            }
            System.out.println("Цена оптимизирована");

        }else{
            System.out.println("Некорректное значение максимальной цены");
        }

    }



    @Override
    public void printBox() {

            for(int i=0;i<sweets.length;i++){
                System.out.println(sweets[i]);
            }

    }
}
