/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import java.io.IOException;
import java.util.Random;
/**
 *
 * @author estadm
 */
public class Principal {
    private Lista _coordenadas;
    private Lista _letras;

    public Principal() throws IOException {
        this._letras = new ListaLetras().letras();
        _coordenadas= new Lista();
        this._coordenadas.insertHeard(230);
        this._coordenadas.insertHeard(285);
        this._coordenadas.insertHeard(340);
        this._coordenadas.insertHeard(395);
        this._coordenadas.insertHeard(450);
        this._coordenadas.insertHeard(505);
        this._coordenadas.insertHeard(560);
        seleccionarPalabras();
    }
    public void imprimir(String a,int b){
        System.out.println(a+" "+b);
    }
    
    public void seleccionarPalabras(){
        Nodo tmpl=_letras.getHead();
        Nodo tmpp=_coordenadas.getHead();
        _letras.imprimir(_letras);
        int maximo =98;
        Random rand = new Random();
        int valor= rand.nextInt(maximo);
        System.out.println(valor);
        for(int i=valor;i!=0;i--){
            tmpl=_letras.listaGetNext(tmpl);     
        }
        System.out.println(((Palabra)(_letras.getData(tmpl))).getValorStr());
        int maximo2 = 6;
        int valor2 = rand.nextInt(maximo2);
        for(int i=valor2;i!=0;i--){
            tmpp=_coordenadas.listaGetNext(tmpp);
        }
        imprimir((((Palabra)(_letras.getData(tmpl))).getValorStr()),((int)_coordenadas.getData(tmpp)));
        
    }
    
}
