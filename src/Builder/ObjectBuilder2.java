package Builder;

public class ObjectBuilder1 implements Ibuilder{
    Object object = new Object();
    @Override
    public void setObject1() {
          object.setParametre1(1);
    }

    @Override
    public void setObject2() {
        object.setParametre2(2);
    }

    @Override
    public void setObject3() {
       object.setParametre3(3);
    }

    @Override
    public Object getBuild() {
        return object;
    }
}
