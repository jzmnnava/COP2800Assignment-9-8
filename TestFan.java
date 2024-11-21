public class TestFan {
  public static void main(String[] args) {
      // Two fan objects
      Fan fan1 = new Fan();
      Fan fan2 = new Fan();

      // Configure fan1
      fan1.setSpeed(Fan.FAST);
      fan1.setRadius(10);
      fan1.setColor("yellow");
      fan1.turnOn();

      // Configure fan2
      fan2.setSpeed(Fan.MED);
      fan2.setRadius(5);
      fan2.setColor("blue");
      fan2.turnOff();

      // Display objects
      System.out.println("Fan 1: " + fan1.toString());
      System.out.println("Fan 2: " + fan2.toString());
  }
}
