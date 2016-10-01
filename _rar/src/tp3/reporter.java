/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 * @author 11518681
 */
public class reporter {
    
    private int idSequencial;
    private String nomeReporter;

    public int getIdSequencial() {
        return idSequencial;
    }

    public void setIdSequencial(int idSequencial) {
        this.idSequencial = idSequencial;
    }

    public String getNomeReporter() {
        return nomeReporter;
    }

    public void setNomeReporter(String nomeReporter) {
        this.nomeReporter = nomeReporter;
    }

    public reporter(int idSequencial, String NomeCompleto) {
        this.idSequencial = idSequencial;
        this.nomeReporter = NomeCompleto;
    }
    
    public String imprimeRep(){
        return "Nome: " + nomeReporter +
                "ID: " + idSequencial;
    }
    
}
