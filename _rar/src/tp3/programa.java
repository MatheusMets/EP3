/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.util.ArrayList;

/**
 *
 * @author 11518681
 */

public class programa {
    
    private int idPrograma;
    private String nomePrograma;
    private ArrayList <reporter> Rep = new ArrayList<>();

    public int getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(int idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNomePrograma() {
        return nomePrograma;
    }

    public void setNomePrograma(String nomePrograma) {
        this.nomePrograma = nomePrograma;
    }

    public programa(int idPrograma, String nomePrograma) {
        this.idPrograma = idPrograma;
        this.nomePrograma = nomePrograma;
    }
 
    public String imprimeprog(){
        return "Nome: " + nomePrograma +
               "ID: " + idPrograma;
    }
    
}
