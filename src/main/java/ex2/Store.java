/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author P.T.B
 */
public class Store 
{
	
    List<Lamp> lampStore = Collections.synchronizedList(new ArrayList<Lamp>());

    public void add(Lamp lamp) {//add object lamp to lampStore
            this.lampStore.add(lamp);
    }

    public void remove(int index) {//remove object lamp by index
            this.lampStore.remove(index);
    }

    public Lamp get(int index) {//get object lamp by index
            return this.lampStore.get(index);
    }

    public int size() {//get siz of arraylist
            return this.lampStore.size();
	}

   
}
