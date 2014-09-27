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
 * @param <T>
 */
public class Lista <T>{
    private Nodo _head;
    private Nodo _tail;
       
    public Lista() throws IOException{
        this._head=null;
        this._tail=null;
    }
    
    public void insertHeard(T pData){
        if(_head==null){
            _head =_tail= new Nodo(pData);
        }
        else{
            Nodo tmp = new Nodo(pData);
            tmp.setNext(_head);
            _head=tmp;
        }
    }    
    
    public boolean buscar(String pData){
        Nodo tmp;
        Nodo cont = _head;
        while(cont!=null){
            tmp = ((Lista)cont.get_data())._head;
            if(pData.substring(0,1).equals(((String)tmp.get_data()).substring(0,1))){
                while(tmp!=null){
                   if(pData.equals((String)tmp.get_data())){
                       return true;
                   }
                   tmp=tmp.getNext();
                }
            }
           cont=cont.getNext();
        }
        return false;
    }
    public T getData(Nodo tmp){
        return (T) (tmp.get_data());
    }
    public Nodo listaGetNext(Nodo tmp){
        tmp=tmp.getNext();
        return tmp;
        
    }
    public Nodo getHead(){
        return _head;
    }
     public void imprimir(Lista m){
        Nodo tmp=m._head;
        while(tmp!=null){
            System.out.println(((Palabra)(tmp.get_data())).getValorStr());
            tmp=tmp.getNext();
        }
      
    }  
}
