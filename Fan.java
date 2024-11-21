public class Fan {
  final static int SLOW = 1;
  final static int MED = 2;
  final static int FAST = 3;

  private int speed;
  private boolean on;
  private double radius;
  String color;

  // Default Fan
  public Fan() {
      speed = SLOW;
      on = false;
      radius = 5;
      color = "blue";
  }

  // Mutator Methods
  public void setSpeed(int newSpeed) {
      speed = newSpeed;
  }

  public void turnOn() {
      on = true;
  }

  public void turnOff() {
      on = false;
  }

  public void setColor(String newColor) {
      color = newColor;
  }

  public void setRadius(double newRadius) {
      radius = newRadius;
  }

  // Accessor methods
  public String getSpeed() {
      String s = "";
      switch (speed) {
          case SLOW: s = "SLOW"; break;
          case MED: s = "MEDIUM"; break;
          case FAST: s = "FAST"; break;
      }
      return s;
  }

  public boolean isOn() {
      return on;
  }

  public double getRadius() {
      return radius;
  }

  public String getColor() {
      return color;
  }

  // Output
  public String toString() {
      if (on) {
          return "Fan speed: " + getSpeed() + ", color: " + color + ", radius: " + radius;
      } else {
          return "Fan color: " + color + ", radius: " + radius + "\nfan is off";
      }
  }
}
