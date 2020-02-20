package com.accp.vo.liutao;

/**
 * This is a singleton pattern for enumeration implementations,and its benefits are obvious
 * I call this the perfect singleton pattern
 */
public enum Instance {
    INSTANCE;
    public void show(){
        System.out.println("Invoke the enumerated singleton pattern");
    }

}
