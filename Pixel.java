
import java.awt.Color;
public class Pixel{

  // declaration des attributs 
  int r,g,b;
  Color couleur=new Color(r,g,b);
  //creation du constructeur 
    public Pixel(){
     this.r = 0; this.g = 0; this.b = 0;
    }
    //creation des methodes pour generer les intervalles respectives des couleurs
    public void setRed(int r){
     if(r>=0 && r<=255) this.r = r;
   }
    public void setGreen(int g){
     if(g>=0 && g<=255) this.g = g;
    }
    public void setBlue(int b){
     if(b>=0 && b<=255) this.b = b;
   }
}