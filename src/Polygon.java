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

  Polygon(int ns) {
    numberSides = ns;
    lengthSides = new double[ns];
  }

  Polygon(int ns, double[] ls) {
    numberSides = ns;
    lengthSides = ls;
  }

  public void setLengthSides(double[] lengthSides) {
    this.lengthSides = lengthSides;
  }

  public double[] getLengthSides() {
    return lengthSides;
  }

  public double getPerimeter() {
    double perimeter = 0;
    for (int i = 0; i < lengthSides.length; i++) {
      perimeter += lengthSides[i];
    }
    return perimeter;
  }

  public String toString() {
    String result = "Sides: ";
    for (int i = 0; i < lengthSides.length; i++) {
      result += lengthSides[i] + " ";
    }
    result += "| Perimeter: " + getPerimeter();
    return result;
  }
}