/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 * @author Matheus P.
 */
public class emissora {
    
    private int idEmissora;
    private String nomeEmissora;
    

    public int getIdEmissora() {
        return idEmissora;
    }

    public void setIdEmissora(int idEmissora) {
        this.idEmissora = idEmissora;
    }

    public String getNomeEmissora() {
        return nomeEmissora;
    }

    public void setNomeEmissora(String nomeEmissora) {
        this.nomeEmissora = nomeEmissora;
    }
    
    
    public emissora(int idSequencial, String nome) {
        this.idEmissora = idSequencial;
        this.nomeEmissora = nome;
    }
    
}
