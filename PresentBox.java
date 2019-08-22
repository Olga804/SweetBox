import java.util.Arrays;

import static jdk.nashorn.internal.objects.ArrayBufferView.length;

public class PresentBox implements Box {
  private Sweet[] sweets=new Sweet[0];



    @Override
    public void add(Sweet sweet) {
        int d=sweets.length;
       Sweet[] copy= Arrays.copyOf(sweets, d+1);
        copy[d]=sweet;
        sweets=Arrays.copyOf(copy, d+1);
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
        for (int i=index;i<sweets.length-1;i++){
            sweets[i]=sweets[i+1];
           Sweet [] copy= Arrays.copyOf(sweets,sweets.length-1);
            sweets=Arrays.copyOf(copy, copy.length);

        }

    }

    @Override
    public void optimizeWeight(double maxWeight) {
        while (getBoxWeight()>maxWeight){
            double min=sweets[0].weight;
            int index=0;
            for (int i=0;i<sweets.length;i++){
                if (sweets[i].weight<min){
                    min=sweets[i].weight;
                    index=i;
                }
            }
            delete(index);
        }

    }

    @Override
    public void optimizePrice(double maxPrice) {
        while (getBoxPrice()>maxPrice){
            double min=sweets[0].price;
            int index=0;
            for (int i=0;i<sweets.length;i++){
                if (sweets[i].price<min){
                    min=sweets[i].price;
                    index=i;
                }
            }
            delete(index);
        }

    }

    /*@Override
    public String toString() {
        for (int i=0;i<sweets.length;i++){
            System.out.print(sweets[i].name," ");
            System.out.print(sweets[i].weight," ");
            System.out.println(sweets[i].price);
        }
        return 0;
    }
    */

    @Override
    public void printBox() {

            System.out.println(Arrays.toString(sweets));
            /*
            не получилось переопределить метод,
            что бы выдавало информацию о всех
            сладостях.
             */

    }
}
