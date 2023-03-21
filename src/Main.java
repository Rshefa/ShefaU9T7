public class Main {
    public static void main(String[] args){

        Point pointA = new Point("A", 5, -7);
        Point pointB = new Point("B", 5, -7);
        Point pointC = new Point("C", 5, 4);

        System.out.println(pointA);
        System.out.println(pointB);
        System.out.println(pointC);

        System.out.println(pointA.equals(pointB));
        System.out.println(pointA.equals(pointC));
        System.out.println(pointB.equals(pointC));
        System.out.println(pointA.equals("Point C"));
        System.out.println(pointA.equals(null));


        ThreeDPoint pointD = new ThreeDPoint("D", 12, -3, 8);
        ThreeDPoint pointE = new ThreeDPoint("E", 12, -3, 8);
        ThreeDPoint pointF = new ThreeDPoint("F", 12, -3, 4);
        ThreeDPoint pointG = new ThreeDPoint("G", 10, -3, 8);
        ThreeDPoint pointH = new ThreeDPoint("H", 10, 15, 8);

        System.out.println(pointD);
        System.out.println(pointE);
        System.out.println(pointF);
        System.out.println(pointG);
        System.out.println(pointH);

        System.out.println(pointD.equals(pointE));
        System.out.println(pointE.equals(pointF));
        System.out.println(pointE.equals(pointG));
        System.out.println(pointF.equals(pointG));
        System.out.println(pointG.equals(pointH));
        System.out.println(pointG.equals(new Point("M", 10, -3)));
        System.out.println(pointG.equals(null));




    }
}
