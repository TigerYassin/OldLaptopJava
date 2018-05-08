public class PointMain3 {

    public static void main(String[] args){
        Point p1 = new Point(5,2);
        Point p2 = new Point(4,3);

        p1.display();
        p2.display();


        p2.translate(2, 4);
        p2.display();


    }
}
