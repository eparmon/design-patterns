package by.eparmon.designpatterns.decorator;

public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
