package abstract_factory;

import abstract_factory.subCategory1.ICategorie1;
import abstract_factory.subCategory2.ICategorie2;

public interface Interface {
    ICategorie1 creatObject1();
    ICategorie2 creatObject2();
}
