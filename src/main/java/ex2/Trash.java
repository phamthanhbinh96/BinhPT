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
public class Trash extends Store
{
    List<Lamp> lampTrash = Collections.synchronizedList(new ArrayList<>());
}
