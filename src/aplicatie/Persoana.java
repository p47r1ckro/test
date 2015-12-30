/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicatie;

/**
 *
 * @author instructor
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Persoana {
    private String nume;
    private int varsta;
    private boolean casatorit;

    public Persoana(String nume, int varsta, boolean casatorit) {
        this.nume = nume;
        this.varsta = varsta;
        this.casatorit = casatorit;
    }

    @Override
    public String toString() {
        return "Persoana "+nume+", varsta "+varsta+", "+(casatorit?"":"ne")+"casatorit(a)";
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public boolean isCasatorit() {
        return casatorit;
    }
    
    
}
