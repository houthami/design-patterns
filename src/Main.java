import abstract_factory.Categiry1;
import factory_method.Interface;
import factory_method.SubClass1;
import factory_method.SubClass2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world, this is  a tutorial about Design Pattern");

        System.out.println("Factory Methode");
        Interface object = new SubClass1();
        String result = object.factoryMethode().methodeOf();
        System.out.println(result);
        object = new SubClass2();
        String result1 = object.factoryMethode().methodeOf();
        System.out.println(result1);

        System.out.println("Abstract Factory");
        abstract_factory.Interface obj = new Categiry1();
        String res = obj.creatObject1().methode2();
        System.out.println(res);
    }
}