/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author P.T.B
 */
public class Main 
{
    public static void main(String[] args) throws InterruptedException 
    {
        //initiate object 
        Store store = new Store();
        Trash trash = new Trash();
        Thread1 t1 = new Thread1(store);
        Thread2 t2 = new Thread2(store, trash);
        Thread3 t3 = new Thread3(store, trash);
        
        //run thread
        t1.start();
        t2.start();
        t3.start();
    }
}