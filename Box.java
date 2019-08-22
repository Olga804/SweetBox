public interface Box {
    void add(Sweet sweet);
    double getBoxWeight();
    double getBoxPrice();
    void delete(int index);
    void optimizeWeight(double maxWeight);
    void optimizePrice(double maxPrice);
    void printBox();
}
