package decorator;

public class Soymilk extends CondimentDecorator {

    public Soymilk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}
