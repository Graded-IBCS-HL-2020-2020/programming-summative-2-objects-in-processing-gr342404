
import processing.core.PApplet;

public class Sketch extends PApplet {

  Ball[] balls;
  Bubble[] bubbles;
  Snowflake[] snowflakes;

  public void settings() {
    size(500, 500);
  }

  public void setup() {
    frameRate(30);
    balls = new Ball[] { new Ball(this), new Ball(this, 300, 450, 75, color(0, 255, 232), 3, 3, 0), new Ball(this),
        new Ball(this) };

    bubbles = new Bubble[] { new Bubble(this), new Bubble(this, 250, 250, 40, color(255, 150), -6, -6, 0),
        new Bubble(this), new Bubble(this) };

    snowflakes = new Snowflake[] { new Snowflake(this), new Snowflake(this, 100, 350, 30, color(255, 150), 2, 3),
        new Snowflake(this), new Snowflake(this) };

  }

  public void draw() {
    background(100);

    balls[0].drawBall();
    balls[0].moveBall();
    balls[1].drawBall();
    balls[1].moveBall();
    balls[2].drawBall();
    balls[2].moveBall();
    balls[3].drawBall();
    balls[3].moveBall();

    bubbles[0].drawBubble();
    bubbles[0].moveBubble();
    bubbles[1].drawBubble();
    bubbles[1].moveBubble();
    bubbles[2].drawBubble();
    bubbles[2].moveBubble();

    snowflakes[0].drawSnowflake();
    snowflakes[0].moveSnowflake();
    snowflakes[1].drawSnowflake();
    snowflakes[1].moveSnowflake();
    snowflakes[2].drawSnowflake();
    snowflakes[2].moveSnowflake();
    snowflakes[3].drawSnowflake();
    snowflakes[3].moveSnowflake();

  }

  public int randomColor(boolean transluscent) {
    int alpha;
    if (transluscent) {
      alpha = 125;
    } else {
      alpha = 255;
    }
    return color(random(0, 255), random(0, 255), random(0, 255), alpha);
  }

  public void mousePressed() {
    balls[0].stop();
    balls[1].stop();
    balls[2].stop();
    balls[3].stop();

  }

  public void mouseReleased() {
    balls[0].start();
    balls[1].start();
    balls[2].start();
    balls[3].start();

  }

  /*
   * EXTRA CHALLENGE - can you make it so that only the ball you actually CLICKED
   * stops? (this is a major challenge - you can use the variables mouseX and
   * mouseY to see where the mouse was clicked.)
   */

  public static void main(String[] args) {
    PApplet.main("Sketch");
  }
}
