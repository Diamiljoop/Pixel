public class Image {
    private Pixel[][] tab;

    public Image(int h, int w) {
        tab = new Pixel[h][w];
        for (int x = 0; x < h; x++) {
            for (int y = 0; y < w; y++) 
            {
                tab[x][y] = new Pixel();
            }
        }
    }

    public void changerCpixel(int x, int y, int r, int g, int b)
    {
        if (x >= 0 && x < tab.length && y >= 0 && y < tab[0].length)
        {
            tab[x][y].setRed(r);
            tab[x][y].setGreen(g);
            tab[x][y].setBlue(b);
        }
    }
    public String toString(){
        String s = "";
        for(int i=0;i<this.tab.length;i++){
        for(int j=0;j<this.tab[0].length;j++){
        s = s + " " + this.tab[i][j].toString();
        }
        s = s + "\n";
        }
        return s;
   }
}