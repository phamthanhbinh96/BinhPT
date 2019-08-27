/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import ex2.Lamp.Status;

/**
 *
 * @author P.T.B
 */
public class Thread2 extends Thread 
{
    Store store;// initiate a Store
    Trash trash;//initiate a Trash
    
    //invoke current class constructor
    public Thread2(Store store, Trash trash) 
    {
        this.store = store;
        this.trash = trash;
    }

    @Override
    public void run() 
    {   
        int thread2_Time_Sleep = 200;
        System.out.println("Thread 2 is running");//show that thread 2 is running
        while (true) //internal loop 
        {
            //for loop to find lamps with status OFF
            for (int i = 0; i < store.size(); i++) 
            {
                if (store.get(i).status.equals(Status.OFF) || store.get(i).status.equals(Status.REPAIR)) 
                {// if lamps have status OFF .or  REPAIR
                    store.remove(i);//remove lamp from store
                    System.out.println("Thread 2 remove lamp : "+store.get(i).toString());//remove it from Store
                    trash.add(store.get(i));// add to trash class
                    System.out.println("Thread 2 add lamp : "+store.get(i).toString() +"to Trash");//remove it from Store
                   
                }    
            } 
            try 
                {
                    Thread.sleep(thread2_Time_Sleep);//set sleep time 
                    System.out.println("Thread2 sleep 200ms !!");
                } catch (InterruptedException ex) {}
        }
    }
}
