package box;

public class Cube {

    private String cubeColour;
    private double edge;
    private Cube cubeType;

    Cube() {

    }

    Cube(String cubeColour, double edge) {
        this.cubeColour = cubeColour;
        this.edge = edge;
    }

    Cube(Cube cubeType) {
        this.cubeType = cubeType;
    }

    public String getCubeColour() {
        return cubeColour;
    }

    public void setCubeColour(String cubeColour) {
        this.cubeColour = cubeColour;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return 6 * edge * edge;
    }

    public void compareCube(Cube c) {

        double x1 = cubeType.getArea() * 46 / 100;
        double x2 = c.getArea() * 46 / 100;

        if (x1 == x2 && c.getCubeColour().equals(cubeType.getCubeColour())) {
            System.out.println("Cubes are identical");
        } else {
            System.out.println("Cubes are different");
        }
    }
}
