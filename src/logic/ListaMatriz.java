package logic;
import java.io.IOException;

public class ListaMatriz {
    private Lista L1;
    private Lista L2;
    private Lista L3;
    private Lista L4;
    private Lista L5;
    private Lista L6;
    private Lista L7;
    private Lista L8;
    private Lista L9;
    private Lista L10;
    private Lista L11;
    private Lista L12;
    private Lista L13;
    private Lista L14;
    private Lista L15;
    public void CreaMatriz() throws IOException{
        L1 =new Lista();
        L2 =new Lista();
        L3 =new Lista();
        L4 =new Lista();
        L5 =new Lista();
        L6 =new Lista();
        L7 =new Lista();
        L8 =new Lista();
        L9 =new Lista();
        L10 =new Lista();
        L11 =new Lista();
        L12 =new Lista();
        L13 =new Lista();
        L14 =new Lista();
        L15 =new Lista();
        int cont=1;
        Lista LisTmp= L1;
        while(cont<=15){
            for(int i=1; i<=15; i++){
                LisTmp.insertHeard("");
            }if (cont==1){
                L1=LisTmp;
                LisTmp=L2;
            }if (cont==2){
                L2=LisTmp;
                LisTmp=L3;
            }if (cont==3){
                L3=LisTmp;
                LisTmp=L4;
            }if (cont==4){
                L4=LisTmp;
                LisTmp=L5;
            }if (cont==5){
                L5=LisTmp;
                LisTmp=L6;
            }if (cont==6){
                L6=LisTmp;
                LisTmp=L7;
            }if (cont==7){
                L7=LisTmp;
                LisTmp=L8;
            }if (cont==8){
                L8=LisTmp;
                LisTmp=L9;
            }if (cont==9){
                L9=LisTmp;
                LisTmp=L10;
            }if (cont==10){
                L10=LisTmp;
                LisTmp=L11;
            }if (cont==11){
                L11=LisTmp;
                LisTmp=L12;
            }if (cont==12){
                L12=LisTmp;
                LisTmp=L13;
            }if (cont==13){
                L13=LisTmp;
                LisTmp=L14;
            }if (cont==14){
                L14=LisTmp;
                LisTmp=L15;
            }if(cont==15){
                L15=LisTmp;
            }
            cont++;
        }
    }
    public void AgregaLetra(Lista posX,int posY, String fraq) throws IOException {
        int cont=1;
        Nodo prin = posX.getHead();
        while(cont<=15){
            if(cont==posY){
                Nodo nuevo =new Nodo(fraq);
                nuevo.setNext(prin.getNext());
                prin.setNext(nuevo);
                
            }
            prin.getNext();
            cont++;
        }
    }
    public static void main(String[] args) throws IOException{
        ListaMatriz L= new ListaMatriz();
        L.CreaMatriz();
        System.out.println(L);
    }
}