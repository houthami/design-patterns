package org.example.creational.singleton;

public class Singleton {

    private static Singleton instance;
    private String s;
    private Singleton(){
        this.s = "default";
    }
    private Singleton(String s){
        this.s = s;
    }
    public static Singleton createSinglton(){
        if(Singleton.instance ==null){
            instance =  new Singleton();
        }
        return instance;
    }
    public static Singleton createSinglton(String s){
        if(Singleton.instance ==null){
            instance =  new Singleton(s);
        }
        return instance;
    }

    public Singleton getSingltonInstace(){
        return instance;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
