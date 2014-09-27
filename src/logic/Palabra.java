/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

/**
 *
 * @author estadm
 */
public class Palabra {
    private String _rutaImagen;
    private int _puntos;
    private String _valorStr;
    
    public Palabra(String ruta,int valor,String valorstr){
        this._rutaImagen=ruta;
        this._puntos=valor;
        this._valorStr=valorstr;
    }
    public int getValorNum(){
        return _puntos;
    }
    public String getValorStr(){
        return _valorStr;
    }
    
    
}
