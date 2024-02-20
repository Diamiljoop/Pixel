public class PixelNB extends Pixel{
    //creation d'une constructeur 
    public PixelNB() {
        super(); 
    }
    // redefinition de methode avec affectation des valeurs constantes
    @Override
    public void setRed(int r) {
        if (r >= 0 && r <= 255) {
            this.r = r;
            this.g = r; 
            this.b = r; 
        }
    }

    @Override
    public void setGreen(int g) {
        if (g >= 0 && g <= 255) {
            this.g = g;
            this.r = g; 
            this.b = g; 
        }
    }

    @Override
    public void setBlue(int b) {
        if (b >= 0 && b <= 255) {
            this.b = b;
            this.r = b; 
            this.g = b; 
    }
   }
}
