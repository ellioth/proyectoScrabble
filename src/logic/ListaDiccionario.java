/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author estadm
 */
public class ListaDiccionario {
    public Lista  agregarTxt() throws IOException{
        BufferedReader br = null;
        FileReader freader;
        LeerTXt leer = new LeerTXt();
        freader=leer.getFile();
        br = new BufferedReader(freader);
        String linea;
        
        Lista ListaPrincipal;
        
        Lista H = new Lista();
        Lista A = new Lista();
        Lista B = new Lista();
        Lista C = new Lista();
        Lista D = new Lista();
        Lista E = new Lista();
        Lista F = new Lista();
        Lista G = new Lista();
        Lista I = new Lista();
        Lista J = new Lista();
        Lista K = new Lista();
        Lista L = new Lista();
        Lista M = new Lista();
        Lista N = new Lista();
        Lista O = new Lista();
        Lista P = new Lista();
        Lista Q = new Lista();
        Lista R = new Lista();
        Lista S = new Lista();
        Lista T = new Lista();
        Lista U = new Lista();
        Lista V = new Lista();
        Lista W = new Lista();
        Lista X = new Lista();
        Lista Y = new Lista();
        Lista Z = new Lista();
            
        while((linea=br.readLine())!=null){
            if(linea.substring(0,1).equals("a"))
                A.insertHeard(linea);
            else if(linea.substring(0,1).equals("b"))
                B.insertHeard(linea);
            else if(linea.substring(0,1).equals("c"))
                C.insertHeard(linea);
            else if(linea.substring(0,1).equals("d"))
                D.insertHeard(linea);
            else if(linea.substring(0,1).equals("e"))
                E.insertHeard(linea);
            else if(linea.substring(0,1).equals("f"))
                F.insertHeard(linea);
            else if(linea.substring(0,1).equals("g"))
                G.insertHeard(linea);
            else if(linea.substring(0,1).equals("h"))
                H.insertHeard(linea);
            else if(linea.substring(0,1).equals("i"))
                I.insertHeard(linea);
            else if(linea.substring(0,1).equals("j"))
                J.insertHeard(linea);
            else if(linea.substring(0,1).equals("k"))
                K.insertHeard(linea);
            else if(linea.substring(0,1).equals("l"))
                L.insertHeard(linea);
            else if(linea.substring(0,1).equals("m"))
                M.insertHeard(linea);
            else if(linea.substring(0,1).equals("n"))
                N.insertHeard(linea);
            else if(linea.substring(0,1).equals("o"))
                O.insertHeard(linea);
            else if(linea.substring(0,1).equals("p"))
                P.insertHeard(linea);
            else if(linea.substring(0,1).equals("q"))
                Q.insertHeard(linea);
            else if(linea.substring(0,1).equals("r"))
                R.insertHeard(linea);
            else if(linea.substring(0,1).equals("s"))
                S.insertHeard(linea);
            else if(linea.substring(0,1).equals("u"))
                U.insertHeard(linea);
            else if(linea.substring(0,1).equals("t"))
                T.insertHeard(linea);
            else if(linea.substring(0,1).equals("v"))
                V.insertHeard(linea);
            else if(linea.substring(0,1).equals("w"))
                W.insertHeard(linea);
            else if(linea.substring(0,1).equals("x"))
                X.insertHeard(linea);
            else if(linea.substring(0,1).equals("y"))
                Y.insertHeard(linea);
            else if(linea.substring(0,1).equals("z"))
                Z.insertHeard(linea);       
        }
         
        ListaPrincipal = new Lista();
        ListaPrincipal.insertHeard(A);
        ListaPrincipal.insertHeard(B);
        ListaPrincipal.insertHeard(C);
        ListaPrincipal.insertHeard(D);
        ListaPrincipal.insertHeard(E);
        ListaPrincipal.insertHeard(F);
        ListaPrincipal.insertHeard(G);
        ListaPrincipal.insertHeard(H);
        ListaPrincipal.insertHeard(I);
        ListaPrincipal.insertHeard(J);
        ListaPrincipal.insertHeard(K);
        ListaPrincipal.insertHeard(L);
        ListaPrincipal.insertHeard(M);
        ListaPrincipal.insertHeard(N);
        ListaPrincipal.insertHeard(O);
        ListaPrincipal.insertHeard(P);
        ListaPrincipal.insertHeard(Q);
        ListaPrincipal.insertHeard(R);
        ListaPrincipal.insertHeard(S);
        ListaPrincipal.insertHeard(T);
        ListaPrincipal.insertHeard(U);
        ListaPrincipal.insertHeard(V);
        ListaPrincipal.insertHeard(W);
        ListaPrincipal.insertHeard(X);
        ListaPrincipal.insertHeard(Y);
        ListaPrincipal.insertHeard(Z);
        
        return ListaPrincipal;
    }
    
}
