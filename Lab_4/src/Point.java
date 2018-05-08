public class Point {

    int x;
    int y;

    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void translate(int dx, int dy){
        x = x +dx;
        y = y +dy;
    }

    public double distance(int other){
        int dx = x - other;
        int dy = y - other;
        return Math.sqrt(dx * dx + dy * dy);

    }

    public double distanceFromOrigin(){
        return Math.sqrt(x * x + y * y);
    }

    public void display(){
        System.out.println("("+x+", "+y + ")");
    }


    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int initialX, int initialY){
        int x = initialX;
        int y = initialY;
    }



}
