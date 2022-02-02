/**
 * Polygon.java
 *
 * UML for polygon class:
 * https://drive.google.com/file/d/1kdJ7Or1WPl3ebkNV-kSSDhRc8KCCbM6O/view?usp=sharing
 *
 * @author axu5 <github.com/axu5>
 * @version 02.02.2022
 */
public class Polygon {
  int numberSides = 3;
  double[] lengthSides;

  Polygon() {
    lengthSides = new double[numberSides];
  }

  /**
   * @param _numberSides number of sides of the polygon you want to create
   */
  Polygon(int ns) {
    numberSides = ns;
    lengthSides = new double[ns];
  }

  /**
   * @param _numberSides number of sides of the polygon you want to create
   * @param _lengthSides the length array for all the sides of your polygon
   */
  Polygon(int ns, double[] ls) {
    numberSides = ns;
    lengthSides = ls;
  }

  /**
   * @param lengthSides Set the length array of the polygon to this value
   */
  public void setLengthSides(double[] lengthSides) {
    this.lengthSides = lengthSides;
  }

  /**
   * @return the length array of the polygon
   */
  public double[] getLengthSides() {
    return lengthSides;
  }

  /**
   * Calculates the perimeter of the polygon.
   * 
   * @return perimeter of the polygon
   */
  public double getPerimeter() {
    double perimeter = 0;
    for (int i = 0; i < lengthSides.length; i++) {
      perimeter += lengthSides[i];
    }
    return perimeter;
  }

  /**
   * Return the string representation of the polygon.
   * 
   * @return string representation of the polygon
   */
  public String toString() {
    String result = "Sides: ";
    for (int i = 0; i < lengthSides.length; i++) {
      result += lengthSides[i] + " ";
    }
    result += "| Perimeter: " + getPerimeter();
    return result;
  }
}