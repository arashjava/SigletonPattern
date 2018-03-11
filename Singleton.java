/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testthread;

/**
 *
 * @author arash
 */
public class Singleton {
    
    private static Singleton mInstance= null;
    
    private Singleton(){}
    
    public static Singleton getInstance(){
        if (mInstance == null){
            mInstance= new Singleton();
        }
        return mInstance;
    }
    
}
