/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicatie;

import java.util.Arrays;
import javax.swing.AbstractListModel;

/**
 *
 * @author instructor
 */
public class ListaPersoane extends AbstractListModel {

    private Persoana[] ppl = new Persoana[0];

    @Override
    public int getSize() {
        return ppl.length;
    }

    @Override
    public Object getElementAt(int index) {
        return ppl[index];
    }

    public void adauga(Persoana p) {
        ppl = Arrays.copyOf(ppl, ppl.length + 1);
        ppl[ppl.length - 1] = p;
        fireContentsChanged(this, -1, -1);
    }

    public void adauga(String n, int v, boolean c) {
        adauga(new Persoana(n, v, c));
    }

    public void sterge(int pozitie) {
        if (pozitie >= 0 && pozitie < ppl.length) {
            
            System.arraycopy(ppl, pozitie + 1, ppl, pozitie, ppl.length - pozitie - 1);
            ppl = Arrays.copyOf(ppl, ppl.length - 1);
            fireContentsChanged(this, -1, -1);
        }
    }
}
