package by.eparmon.designpatterns.decorator;

public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    protected CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
