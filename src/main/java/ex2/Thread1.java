/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author P.T.B
 */
public class Thread1 extends Thread 
{
    Store store;// initiate a Store

    //invoke current class constructor
    public Thread1(Store store) 
    {
        this.store = store;
    }

    @Override
    public void run() 
    {
        int thread1_Time_Sleep = 100;
        AtomicInteger index = new AtomicInteger();

        System.out.println("Thread 1 is running");
        while (true) 
        {
            Random rd = new Random();// use Random() to generate a number
            int number_Of_Lamp =1 + rd.nextInt(20) ;// creat random number of lamp from 1 to 20 
            
            System.out.println(" Number of lamps generated: " + number_Of_Lamp);// print random number generated

            //use for loop to creat and lamps to list
            for (int i = 0; i < number_Of_Lamp; i++)
            {
                Lamp lamp = new Lamp(index.getAndIncrement());// create new object Lamp

                store.add(lamp);// save new object lamp created to Store

                // print info of lamps added to store
                System.out.println("new lamp: " + lamp.toString());
            }
            try
                {
                    Thread.sleep(thread1_Time_Sleep);// set sleep 100ms
                    System.out.println("Thread1 sleep 100ms!!");
                } catch (InterruptedException ex){}
        }
    }
}

