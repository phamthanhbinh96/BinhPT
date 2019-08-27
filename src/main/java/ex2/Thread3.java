/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import ex2.Lamp.Status;
import java.util.Random;

/**
 *
 * @author P.T.B
 */
public class Thread3 extends Thread 
{
    Store store;// initiate a Store
    Trash trash;//initiate a Trash

     //invoke current class constructor
    public Thread3(Store store, Trash trash) 
    {
        this.store = store;
        this.trash = trash;
    }
    Random r = new Random();
    int random;
    @Override
    public void run() 
    {   
        int thread3_Time_Sleep = 200;
        System.out.println("Thread 3 is running");
        while (true) //internal loop
        {
            //for loop to check list Trash
            for (int i = 0; i < trash.size(); i++) 
            {
                if (trash.get(i).status.equals(Status.REPAIR))// if a lamp in list Trash has status REPAIR 
                {
                    store.add(trash.get(i));//add REPAIR lamp back to Store
                    System.out.println("Thread 3 add REPAIR lamp to Store: "+trash.get(i).toString());//show information of lamp
                    trash.remove(i);//remove REPAIR lamp from Trash
                }
                else if(trash.get(i).status.equals(Status.OFF))// if a lamp in Trash has status OFF
                {
                    random = r.nextInt(2);//create a random number (0 or 1)
                    if(random==0) 
                    {
                        trash.remove(i);//if random=0 remove the lamp out of Trash
                    }
                    else
                    {//check if the random number is 1
                        trash.get(i).setStatus(Status.REPAIR);//set status  =  REPAIR
                        store.add(trash.get(i));//and add to store
                        //show the information of lamp after changed
                        System.out.println("Lamp after changed and add to store: "+trash.get(i).toString());
                    }
                } 
            }
             try 
                {
                        Thread.sleep(thread3_Time_Sleep);//set time sleep
                        System.out.println("Thread 3 sleep 200ms !!");
                } catch (InterruptedException ex) {}
        }
    }
}