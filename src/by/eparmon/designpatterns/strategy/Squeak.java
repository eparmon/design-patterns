package by.eparmon.designpatterns.strategy;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("by.eparmon.designpatterns.behavior.Squeak");
    }

}
