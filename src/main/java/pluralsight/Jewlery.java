package pluralsight;

public class Jewlery extends FixedAsset {
    double Karat;

    public Jewlery(String name, double marketValue, double karat) {
        super(name, marketValue);
        Karat = karat;
    }

    @Override
    public double getValue() {
        return Karat;
    }
}
