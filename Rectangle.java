public class Rectangle {
    private Point hg;
    private Point bd;
public Rectangle(){

 this(0,0);
}
public Rectangle(Point P,Point h){

     this.hg=h;

     this.bd=P;
}
public Point getHg() {
        return hg;
    }
public void setHg(Point hg) {
        this.hg = hg;
    }
public Point getBd() {
        return bd;
    }

    public void setBd(Point bd) {
        this.bd = bd;
    }

public void afficher() {
        System.out.println(this.hg.toString() + " et " + this.bd.toString());
    }

    public int surface() {
        int l, L;
        l = this.hg.getX() - this.bd.getX();
        L = this.hg.getY() - this.bd.getY();
        return Math.abs(l * L);
    }

    public void zoom(int DX, int DY) {
        // modification sur bas droit
        bd.setY(bd.getY() - DY);
        bd.setX(bd.getX() + DX);
        // modification sur haut gauche
        hg.setX(hg.getX() - DX);
        hg.setY(hg.getY() + DY);
    }

}
