package com.xkball.xkballs_railway.client.render.line;


import org.lwjgl.util.vector.Vector3f;

public class Node {
    static final float halfSquareRootThree = 0.8660254037f;
    
    private final Vector3f vec_1 = new Vector3f(0,0,1);
    private final Vector3f vec_2 = new Vector3f(0,-halfSquareRootThree,0.5f);
    private final Vector3f vec_3 = new Vector3f(0,-halfSquareRootThree,-0.5f);
    private final Vector3f vec_4 = new Vector3f(0,0,-1);
    private final Vector3f vec_5 = new Vector3f(0,halfSquareRootThree,-0.5f);
    private final Vector3f vec_6 = new Vector3f(0,halfSquareRootThree,0.5f);
    
    private final Vector3f[] vector3fs = new Vector3f[]{vec_1,vec_2,vec_3,vec_4,vec_5,vec_6};
    
    public Node(){
    
    }
    
    public Node withX(float x){
        return new Node().setX(x);
    }
    
    public Node setX(float x){
        for(var c : vector3fs){
            c.setX(x);
        }
        return this;
    }
    
}
