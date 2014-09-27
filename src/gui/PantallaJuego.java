package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import logic.*;

public class PantallaJuego extends JFrame{
    private BufferedImage _imageFondo;
    private BufferedImage _imageResalto;
    private BufferedImage _imagePalabra;
    int y=57;
    int x=55;
    private Image imagen;
    private Graphics grd;
    public PantallaJuego(){
        setSize(1333,768);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setExtendedState(MAXIMIZED_BOTH);
        init();
    }
    public void init(){
        CargarImage loaders = new CargarImage();
        BufferedImage fondo= null;
        BufferedImage resalto= null;
        BufferedImage palabra = null;
        try {
            fondo = loaders.loadImage("/Image/Fondo1.png");
            resalto = loaders.loadImage("/Image/resalto.png");
            palabra = loaders.loadImage("/Image/palabraR.png");
        } catch (Exception e) {
        }
        Sprite sFondo = new Sprite(fondo);
        Sprite sResalto = new Sprite(resalto);
        Sprite sPalabra = new Sprite(palabra);
        _imageFondo= sFondo.grabsprite(0, 0,1365,750);
        _imageResalto= sResalto.grabsprite(0,0,48,44);
        _imagePalabra = sPalabra.grabsprite(0,0, 48,44);
        
        
    }
    @Override
    public void paint(Graphics g){
        imagen = createImage(getWidth(),getHeight());
        grd= imagen.getGraphics();
        paintComponents(grd);
        g.drawImage(imagen, 0, 0, this);
    }  
    
    @Override
    public void paintComponents(Graphics g){
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            
        }
        if(x>=700){
            x=55;
            y+=43;
        }
        else
            x+=48;
        g.drawImage(_imageFondo,0,20, this);
        g.drawImage(_imageResalto,x,y, this);
        g.drawImage(_imagePalabra,230,715,this);
        g.drawImage(_imagePalabra,285,715,this);
        g.drawImage(_imagePalabra,340,715,this);
        g.drawImage(_imagePalabra,395,715,this);
        g.drawImage(_imagePalabra,450,715,this);
        g.drawImage(_imagePalabra,505,715,this);
        g.drawImage(_imagePalabra,560,715,this);
        repaint();
    }
    
    }

