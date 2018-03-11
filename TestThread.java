/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testthread;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arash
 */
public class TestThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            chooseOption();
    }
    
    private static void chooseOption(){
        int opt=10;
        ArrayList<String> al= new ArrayList<String>();
        al.add("Mercedes benz");
        al.add("Toyota");
        al.add("Chevy");
        al.add("Ford");
        al.add("to walk");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Choose 1~5 or press 0 to quit:");
            System.out.println("--------------------------------");
            for (int i=0; i< al.size(); i++){
                System.out.println(i+1+" - I like "+al.get(i));
            }
            opt=sc.nextInt()-1;
            if (opt <0 ){ break;}   // quite program in case 0 entered
            Runnable runIt= null;
            runIt= new RunThreadsSigleton(al.get(opt));
//            runIt= new RunThreadsWitoutSingleton(al.get(opt));
            for (int i=0; i<4; i++){
                runIt.run();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TestThread.class.getName()).log(Level.SEVERE, null, ex);
                }              
            }    
        }

    }
    
}
