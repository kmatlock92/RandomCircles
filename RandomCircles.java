package week2;
/*In this program, the goal is to have
 * 10 circles of different sizes, color, and placement
 * on the graphics window.
 */


import acm.graphics.GOval;
import acm.program.GraphicsProgram; // I have to import a few more tools to make this program work.
import acm.util.RandomGenerator;


public class RandomCircles extends GraphicsProgram
{
  // I defined my constants to set the radi. 
  //I played around with the RandomGenerator.getInstance();. 
  //It doesn't matter if its at the top or the bottom

  private static final int superCircles = 10;

  private static final int minRadius = 3;

  private static final int maxRadius = 75;

  @Override
  public void run()
  {
    for (int i = 0; i < superCircles; i++)
    {
      drawCircle();
    }
  }

  private void drawCircle() //
  {
    double radius = rgen.nextDouble(minRadius, maxRadius);
    double x = rgen.nextDouble(0, getWidth() - radius * 2);
    double y = rgen.nextDouble(0, getHeight() - radius * 2);
    GOval circle = new GOval(x, y, radius * 2, radius * 2);
    circle.setFilled(true);
    circle.setColor(rgen.nextColor());
    add(circle);
  }

  private RandomGenerator rgen = RandomGenerator.getInstance();

}