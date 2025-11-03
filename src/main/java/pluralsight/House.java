package pluralsight;

public class House extends FixedAsset {
    int YearBuilt;
    int sqaureFeet;
    int bedrooms;

    public House(String name, double marketValue, int yearBuilt, int sqaureFeet, int bedrooms) {
        super(name, marketValue);
        YearBuilt = yearBuilt;
        this.sqaureFeet = sqaureFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return sqaureFeet + bedrooms;
    }
}
