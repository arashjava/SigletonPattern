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
public class RunThreadsSigleton implements Runnable{
    
    private String message;
    private static int history;

    public RunThreadsSigleton(String message ) {
        this.message = message;
        history=0;
    }
        
    @Override
    public void run() {
        Singleton mSingleton = Singleton.getInstance();
        if (System.identityHashCode(mSingleton) != history){
            System.out.println("--------------------------------");
            System.out.println("\t You like "+ message);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        }    
        history= System.identityHashCode(mSingleton);
    }
    
  
}