/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Data.Tokens;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author salaz
 */
public class Archivo2tokens {
    
    private static Archivo2tokens _instancia;
    private static ArrayList<String> lineas;
    
    
    private Archivo2tokens()
    {
        lineas=new ArrayList<>();
    }
    
    public static synchronized Archivo2tokens getInstance()
    {
        if(_instancia==null)
        {
            _instancia=new Archivo2tokens();
        }
        return _instancia;
    }
    
    
    public void leerArchivo(String Ruta) throws FileNotFoundException, IOException
    {
        String cadena;
        lineas.clear();
        FileReader f = new FileReader(Ruta);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            lineas.add(cadena);
        }
        b.close();
    }
    
    public ArrayList generarTokens()
    {
        ArrayList<Tokens> tokens =new ArrayList<>();
        
        return tokens;
    }
    
}
