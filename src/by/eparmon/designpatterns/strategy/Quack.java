package by.eparmon.designpatterns.strategy;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("by.eparmon.designpatterns.behavior.Quack");
    }

}
