package by.eparmon.designpatterns.decorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + getSoyCost();
    }

    private double getSoyCost() {
        switch (beverage.getSize()) {
            case TALL:
                return 0.10;
            case GRANDE:
                return 0.15;
            case VENTI:
                return 0.20;
        }
        throw new IllegalArgumentException(beverage.getSize().name());
    }

}
