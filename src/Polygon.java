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
  // instance variables (attributes)
  private int numberSides = 3;
  private double[] lengthSides;

  Polygon() {
    this.lengthSides = new double[numberSides];
  }

  /**
   * @param _numberSides number of sides of the polygon you want to create
   */
  Polygon(int ns) {
    this.numberSides = ns;
    this.lengthSides = new double[ns];
  }

  /**
   * @param _numberSides number of sides of the polygon you want to create
   * @param _lengthSides the length array for all the sides of your polygon
   */
  Polygon(int ns, double[] ls) {
    this.numberSides = ns;

    if (ns != ls.length) {
      throw new IllegalArgumentException("The number of sides and the length of the sides array do not match.");
    }

    // do not point to the array, but copy the array
    // this could lead to possible bugs otherwise
    this.lengthSides = new double[ns];
    for (int i = 0; i < ns; i++) {
      this.lengthSides[i] = ls[i];
    }
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
    return this.lengthSides;
  }

  /**
   * Calculates the perimeter of the polygon.
   * 
   * @return perimeter of the polygon (∑ lengthSides)
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
    for (int i = 0; i < this.lengthSides.length; i++) {
      result += this.lengthSides[i] + " ";
    }
    result += "| Perimeter: " + this.getPerimeter();

    // return in the format "Sides: 1 1 0.34 | Perimeter: 2.34"
    return result;
  }
}