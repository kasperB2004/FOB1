public class Rechthoek {

    Punt leftTop;
    Punt rightBottom;
    public Rechthoek(Punt punt, Punt punt1) {
        if((punt.getX() ==  punt1.getX()) || (punt.getY() ==  punt1.getY()))
        {
            resetPoints();
        }
        else if((punt.getX() > punt1.getX()) ||(punt.getY() < punt1.getY()) ){
            resetPoints();
        }else {


            this.leftTop = punt;
            this.rightBottom = punt1;
        }
    }
    private  void resetPoints(){
        System.out.println("Punt 1 en 2 niet resp. linksboven, rechtsbeneden of geen rechthoek! Punten op(0,1), (1,0) gezet");
        this.leftTop = new Punt(0,1);
        this.rightBottom = new Punt(1,0);
    }

    public Punt getLeftTop() {
        return leftTop;
    }

    public Punt getRightBottom() {

        return rightBottom;
    }

    public Rechthoek omhullendeRechthoek(Rechthoek rechthoek) {

        int x1 ,x2,y1,y2;

        x1 = Math.min(leftTop.getX(), rechthoek.leftTop.getX());
        y1 = Math.max(leftTop.getY(), rechthoek.leftTop.getY());
        x2 = Math.max(rightBottom.getX(), rechthoek.rightBottom.getX());
        y2 = Math.min(rightBottom.getY(), rechthoek.rightBottom.getY());

        return new Rechthoek(new Punt(x1,y1),new Punt(x2,y2));
    }

    public String toString(){
        return "RechtHoek [("+ leftTop.getX()+","+ leftTop.getY()+")("+ rightBottom.getX()+","+ rightBottom.getY()+")]" ;
    }

    public boolean contains(Rechthoek rechthoek) {
        return (rechthoek.getLeftTop().getX() >= leftTop.getX() && rechthoek.getRightBottom().getX() <= rightBottom.getX() && rechthoek.leftTop.getY() <= leftTop.getY() && rechthoek.rightBottom.getY() >= rightBottom.getY());
    }
    public boolean contains(Punt punt) {
        return (punt.getX() >= leftTop.getX() && punt.getX() <= rightBottom.getX() && punt.getY() <= leftTop.getY() && punt.getY() >= rightBottom.getY());
    }
    public boolean getLengthDiagonal() v 

    public boolean getOmtrek() {

    }

    public boolean getManhattanDistance() {

    }
}
