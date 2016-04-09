/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author salaz
 */
public class Tokens {
    private String simbolo;
    private int numeroLinea;
    private int numeroColumna;
    private String CodigoError;

    
    
    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public int getNumeroColumna() {
        return numeroColumna;
    }

    public void setNumeroColumna(int numeroColumna) {
        this.numeroColumna = numeroColumna;
    }

    public String getCodigoError() {
        return CodigoError;
    }

    public void setCodigoError(String CodigoError) {
        this.CodigoError = CodigoError;
    }
    
    
    
}
