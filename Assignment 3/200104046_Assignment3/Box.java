package box;

public class Box {

    public static void main(String[] args) {

        Cube cb1 = new Cube("Black", 15);
        Cube cb2 = new Cube("Black", 15);

        System.out.println("Cube 1 Colour : " + cb1.getCubeColour());
        System.out.println("Cube 1 Area : " + cb1.getArea());

        System.out.println("Cube 2 Colour : " + cb2.getCubeColour());
        System.out.println("Cube 2 Area : " + cb2.getArea());

        new Cube(cb1).compareCube(cb2);
        System.out.println();

        Cube cb3 = new Cube("Black", 45);

        System.out.println("Cube 1 Colour : " + cb1.getCubeColour());
        System.out.println("Cube 1 Area : " + cb1.getArea());

        System.out.println("Cube 3 Colour : " + cb3.getCubeColour());
        System.out.println("Cube 3 Area : " + cb3.getArea());

        new Cube(cb1).compareCube(cb3);
    }
}
