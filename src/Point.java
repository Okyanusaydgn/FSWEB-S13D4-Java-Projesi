public class Point {

    private int x;

    private int y;

 // getX ve getY methodu sayesinde bu sınıfın dışında olan başka bir kodun x ve y değerlerini alabilmesini sağlar ve ilgili değişkenlerin değerini döndürür.
 // setX ve setY methodları sayesinde point nesnesinin x ve y değerlerini değiştirebiliriz.
 // overloading ; isimleri aynı fakat farklı parametrelere sahip constructor veya methodlara diyoruz.
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(Math.pow(getX(),2) + Math.pow(getY(),2));
    }
    // aşağıdaki method da point objesini baz alıyoruz.
    // aşağıdaki point objesi x ve y nin farklı bir instance yapısı.

    public double distance(Point p){
        if(p != null){
            return Math.sqrt(Math.pow(this.getX() - p.getX(),2) + Math.pow(this.getY() - p.getY(),2));
        }
        System.out.println(" point cant be null !! ");
        return -1; // bu kısmı kendimiz yazdık farklı bir değer de verebiliriz.
    }

    // bu en son yazdığımız aşağıdaki method da ise x ve y tanımlı primitive type var.
    public double distance(int x, int y){
        return Math.sqrt(Math.pow(this.getX() - x,2) + Math.pow(this.getY() - y, 2));
    }

}