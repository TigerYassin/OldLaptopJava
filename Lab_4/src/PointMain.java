import java.util.Scanner;

public class PointMain extends Point{

    public static void main(String[] args){

        Point p1 = new Point();
        p1.x = 7;
        p1.y = 2;
        System.out.println(p1.x+ ", " + p1.y);
        System.out.println("p1: " + p1);


        Point p2 = new Point();
        p2.x =+2;
        p2.y ++;
        System.out.println(p2.x+ ", " + p2.y);

        Point[] cities = readCities(new Scanner(System.in));
        for(int i =0; i < cities.length; i++) {
            cities[i].display();
        }


    }


    public static Point[] readCities(Scanner input){
        int numCities = input.nextInt();
        Point[] cities = new Point[numCities];
        for (int i =0; i <cities.length; i++){
            cities[i] = new Point();
            cities[i].x = input.nextInt();
            cities[i].y = input.nextInt();
        }
        return cities;
    }

    public static void boom(Point bomb, int radius, Point[] cities){
        for (int i = 0; i < cities.length; i++){
            int dx = cities[i].x - bomb.x;
            int dy = cities[i].y - bomb.y;
            double distance = Math.sqrt(dx * dx + dy * dy);
            if(distance <= radius){
                System.out.println("(" + cities[i].x + ", " + cities[i].y + ")");
            }

        }
    }


}
