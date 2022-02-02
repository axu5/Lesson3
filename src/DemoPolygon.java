/**
 * DemoPolygon.java
 *
 * This is a test class for the class Polygon
 *
 * @author axu5 <github.com/axu5>
 * @version 02.02.2022
 */
public class DemoPolygon {
  public static void main(String[] _args) {
    Polygon myTriangle = new Polygon(3);

    double[] squareData = { 3, 3, 3, 3 };
    Polygon mySquare = new Polygon(4, squareData);

    double[] pitTri = { 3, 3, 5 };
    myTriangle.setLengthSides(pitTri);

    // Complete the code so you print the following Info:
    // number of sides of "mySquare"
    System.out.println("number of sides of \"mySquare\": " + mySquare.getLengthSides().length);
    // length of the 2nd side of "myTriangle"
    System.out.println("length of the 2nd side of \"myTriangle\": " + myTriangle.getLengthSides()[1]);
    // perimeter of "myTriangle"
    System.out.println("perimeter of \"myTriangle\": " + myTriangle.getPerimeter());

    System.out.println(myTriangle);
    System.out.println(mySquare);
  }
}