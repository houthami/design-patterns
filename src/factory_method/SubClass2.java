package factory_method;

public class SubClass2 implements Interface{
    @Override
    public Interface factoryMethode() {
        return new SubClass2();
    }

    @Override
    public String methodeOf() {
        return "subClass2";
    }
}
