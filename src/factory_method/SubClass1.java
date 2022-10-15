package factory_method;

public class SubClass1 implements Interface{
    @Override
    public Interface factoryMethode() {
        return new SubClass1();
    }

    @Override
    public String methodeOf() {
        return "subClass1";
    }
}
