public class Main {
    public static void main(String[] args) {

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("X DEĞERİ = " + first.getX());
        // first.setX(9); //  normalde first 6 , 5 ama setX ile 9,5
        // bu yukarıdaki işlemlerden sonra x değerini yazdırmak istersek
        //System.out.println
        System.out.println("distance(second)= " + first.distance(second)); // burayı ikinci method için yani point objesine göre yaptık.
        System.out.println("distance(2,2)= " + first.distance(2, 2));

    }
}