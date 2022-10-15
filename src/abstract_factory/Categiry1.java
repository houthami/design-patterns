package abstract_factory;

import abstract_factory.subCategory1.ICategorie1;
import abstract_factory.subCategory1.Object2;
import abstract_factory.subCategory2.ICategorie2;

public class Categiry1 implements Interface {
    @Override
    public ICategorie1 creatObject1() {
        return new Object2();
    }

    @Override
    public ICategorie2 creatObject2() {
        return new abstract_factory.subCategory2.Object2();
    }
}
