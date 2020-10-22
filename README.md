# Flyweight Design Pattern (Java Implementation)

**Flyweight** object share data as possible with similar objects to minimize memory usage.
![](https://github.com/shamy1st/design-pattern-flyweight-java/blob/main/flyweight-uml.png)
### Problem: 
You have a **Point** of interest on a map application, and it consumes a lot of memory because of the icon large size 20KB per Point.

    public class Main {
        public static void main(String[] args) {
            PointService service = new PointService();
            service.getPoints().forEach(point -> point.draw());
        }
    }

    public class PointService {
        public List<Point> getPoints() {
            List<Point> points = new ArrayList<>();
            Point p1 = new Point(1, 2, PointType.CAFE, null);
            points.add(p1);
            return points;
        }
    }

    public enum PointType {
        HOSPITAL,
        CAFE,
        RESTAURANT
    }

    public class Point {
        private int x;          //4 bytes
        private int y;          //4 bytes
        private PointType type; //4 bytes
        private byte[] icon;    //20 KB
        
        public Point(int x, int y, PointType type, byte[] icon) {
            this.x = x;
            this.y = y;
            this.type = type;
            this.icon = icon;
        }
        
        public void draw() {
            System.out.printf("%s at (%d, %d)", icon.getType(), x, y);
        }
    }
### Solution:
![](https://github.com/shamy1st/design-pattern-flyweight-java/blob/main/flyweight-solution-uml.png)
