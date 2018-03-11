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
public class RunThreadsWitoutSingleton implements Runnable{
    
    private String message;

    public RunThreadsWitoutSingleton(String message ) {
        this.message = message;
    }
        
    @Override
    public void run() {
        System.out.println("--------------------------------");
        System.out.println("\t You like "+ message);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

    }
}