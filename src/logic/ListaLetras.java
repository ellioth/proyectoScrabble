/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logic;

import java.io.IOException;

/**
 *
 * @author estadm
 */
public class ListaLetras {

    /**
     *
     * @return
     * @throws IOException
     */
    public Lista palabras() throws IOException{
        Lista palabras = new Lista();
        Palabra A = new Palabra("/Image/palabraA",1,"a");
        Palabra B = new Palabra("/Image/palabraB",3,"b");
        Palabra C = new Palabra("/Image/palabraC",3,"c");
        Palabra D= new Palabra("/Image/palabraD",2,"d");
        Palabra E= new Palabra("/Image/palabraE",1,"e");
        Palabra F= new Palabra("/Image/palabraF",4,"f");
        Palabra G= new Palabra("/Image/palabraG",2,"g");
        Palabra H= new Palabra("/Image/palabraH",4,"h");
        Palabra I= new Palabra("/Image/palabraI",1,"i");
        Palabra J= new Palabra("/Image/palabraJ",8,"j");
        Palabra K= new Palabra("/Image/palabraK",5,"k");
        Palabra L= new Palabra("/Image/palabraL",1,"l");
        Palabra M= new Palabra("/Image/palabraM",3,"m");
        Palabra N= new Palabra("/Image/palabraN",1,"n");
        Palabra O= new Palabra("/Image/palabra0",1,"o");
        Palabra P= new Palabra("/Image/palabraP",3,"p");
        Palabra Q= new Palabra("/Image/palabraQ",10,"q");
        Palabra R= new Palabra("/Image/palabraR",1,"r");
        Palabra S= new Palabra("/Image/palabraS",1,"s");
        Palabra T= new Palabra("/Image/palabraT",1,"t");
        Palabra U= new Palabra("/Image/palabraU",1,"u");
        Palabra V= new Palabra("/Image/palabraV",4,"v");
        Palabra W= new Palabra("/Image/palabraW",4,"w");
        Palabra X= new Palabra("/Image/palabraX",8,"x");
        Palabra Y= new Palabra("/Image/palabraY",4,"y");
        Palabra Z= new Palabra("/Image/palabraZ",10,"z");
        
        
        
        palabras.insertHeard(A);
        palabras.insertHeard(B);
        palabras.insertHeard(C);
        palabras.insertHeard(D);
        palabras.insertHeard(E);
        palabras.insertHeard(F);
        palabras.insertHeard(G);
        palabras.insertHeard(H);
        palabras.insertHeard(I);
        palabras.insertHeard(J);
        palabras.insertHeard(K);
        palabras.insertHeard(L);
        palabras.insertHeard(M);
        palabras.insertHeard(N);
        palabras.insertHeard(O);
        palabras.insertHeard(P);
        palabras.insertHeard(Q);
        palabras.insertHeard(R);
        palabras.insertHeard(S);
        palabras.insertHeard(T);
        palabras.insertHeard(U);
        palabras.insertHeard(V);
        palabras.insertHeard(W);
        palabras.insertHeard(X);
        palabras.insertHeard(Y);
        palabras.insertHeard(Z);
        return palabras;
    }
    public Lista numerosLetras() throws IOException{
        Lista numerosPalabras = new Lista();
        numerosPalabras.insertHeard(9);
        numerosPalabras.insertHeard(2);
        numerosPalabras.insertHeard(2);
        numerosPalabras.insertHeard(4);
        numerosPalabras.insertHeard(12);
        numerosPalabras.insertHeard(2);
        numerosPalabras.insertHeard(3);
        numerosPalabras.insertHeard(2);
        numerosPalabras.insertHeard(9);
        numerosPalabras.insertHeard(1);
        numerosPalabras.insertHeard(1);
        numerosPalabras.insertHeard(4);
        numerosPalabras.insertHeard(2);
        numerosPalabras.insertHeard(6);
        numerosPalabras.insertHeard(8);
        numerosPalabras.insertHeard(2);
        numerosPalabras.insertHeard(1);
        numerosPalabras.insertHeard(6);
        numerosPalabras.insertHeard(4);
        numerosPalabras.insertHeard(6);
        numerosPalabras.insertHeard(4);
        numerosPalabras.insertHeard(2);
        numerosPalabras.insertHeard(2);
        numerosPalabras.insertHeard(1);
        numerosPalabras.insertHeard(2);
        numerosPalabras.insertHeard(1);
        return numerosPalabras;
    }
    public Lista letras() throws IOException{
        int cont=0;
        Lista letra = new Lista();
        Lista numeros= numerosLetras();
        Lista palabras = palabras();
        Nodo tmp=numeros.getHead();
        Nodo tmp2=palabras.getHead();
        for(int i=0;i<26;i++){
            for(int j = (int)(numeros.getData(tmp));j>0;j--){
                letra.insertHeard(((Palabra)(palabras.getData(tmp2)))); 
            }
            cont++;
            tmp=numeros.listaGetNext(tmp);
            tmp2=palabras.listaGetNext(tmp2);
        }
        return letra;
    }
    
}
