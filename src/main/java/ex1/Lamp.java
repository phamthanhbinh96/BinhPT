/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Random;

/**
 *
 * @author P.T.B
 */
public class Lamp {
	public enum Status {//use enum to set type of status
		ON, OFF
	}

	public Status status;
	int index;
	
	//use switch-case to generate random status
	protected Lamp(int index){
            this.index = index;

            switch(new Random().nextInt(2)) {
            case 0:
                    this.status = Status.ON;
                    break;
            case 1:
                    this.status = Status.OFF;
                    break;
            }
	}

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
        
	
	//show information of lamp
	@Override
	public String toString() {
            return String.format("Index= %d , Status= %s ", getIndex(), getStatus());
	}
}
