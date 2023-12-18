package org.example.creational.builder;

public class BuilderClass implements IBuilder{
    private Object1 object1;
    private Object2 object2;
    private Object3 object3;
    private Object4 object4;
    @Override
    public void setObject1(String s) {
        this.object1 = new Object1(s);
    }

    @Override
    public void setObject2(String s) {
        this.object2 = new Object2(s);
    }

    @Override
    public void setObject3(String s) {
        this.object3 = new Object3(s);
    }

    @Override
    public void setObject4(String s) {
        this.object4 = new Object4(s);
    }

    public String toString(){
        String info = "";
        info += "Object 1 : " + (!(object1 == null)?"o1 :"+object1.methode():"") + "\n";
        info += "Object 2 " + (!(object2 == null)?"o1 :"+object2.methode():"") + "\n";
        info += "Object 3 " + (!(object3 == null)?"o1 :"+object3.methode():"") + "\n";
        info += "Object 4 " + (!(object4 == null)?"o1 :"+object4.methode():"") + "\n";
        return info;
    }
}
