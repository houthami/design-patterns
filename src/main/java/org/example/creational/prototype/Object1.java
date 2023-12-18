package org.example.creational.prototype;

import org.json.simple.JSONObject;

public class Object1 implements IObject{

    private JSONObject data;

    public Object1(){

    }

    public JSONObject getData() {
        return data;
    }

    public Object1(JSONObject data){
        this.data = data;
    }

    public Object1(Object1 o){
        if(o != null){
            this.data = o.data;
        }
    }

    public void setData(JSONObject data) {
        this.data = data;
    }

    @Override
    public Object1 clone() {
        return new Object1(this);
    }

    @Override
    public String toString(){
        String info = "";
        info += "data : " + this.data + "\n";
        return info;
    }
}
