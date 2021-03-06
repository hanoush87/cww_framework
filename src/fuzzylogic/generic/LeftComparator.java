/*
 * Copyright (c) 2015 Aysenur Bilgin
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzylogic.generic;

import fuzzylogic.inference.Couple;
import java.util.Comparator;

/**
 *
 * @author abilgin
 */
public class LeftComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        if (o1 instanceof InfTuple) {
            return new Double(((InfTuple) o1).getCentroidInterval().getLeft()).compareTo(((InfTuple) o2).getCentroidInterval().getLeft());
        }
        else {
            return new Double(((Couple) o1).getCentroidInterval().getLeft()).compareTo(((Couple) o2).getCentroidInterval().getLeft());
        }

    }
}
