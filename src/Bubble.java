class Bubble {

  private Sketch s;
  private float diameter;
  private float x;
  private float y;
  private int col;
  private int borderColor;
  private float speedY;
  private float speedX;

  public Bubble(Sketch sketch) {
    s = sketch;
    diameter = s.random(40, 60);
    x = s.random(diameter / 2, s.width - diameter / 2);
    y = s.random(diameter / 2, s.height - diameter / 2);
    col = s.color(255, 150);
    speedX = s.random(-4, -8);
    speedY = s.random(-4, -8);
  }

  public Bubble(Sketch bubSketch, float bubX, float bubY, float bubbleDiam, int bubbleColor, float bubsx, float bubsy,
      int borderBubble) {
    s = bubSketch;
    x = bubX;
    y = bubY;
    diameter = bubbleDiam;
    col = bubbleColor;
    speedX = bubsx;
    speedY = bubsy;
    borderColor = borderBubble;

  }

  public float getRadius() {

    return diameter / 2;
  }

  public void drawBubble() {
    s.stroke(borderColor);
    s.fill(col);
    s.ellipse(x, y, diameter, diameter);
  }

  public void moveBubble() {

    if (x < (-getRadius())) {
      x = s.width + getRadius();
    }

    if (x > (s.width + getRadius())) {
      x = -getRadius();
    }

    if (y < (-getRadius())) {
      y = s.height + getRadius();
    }

    if (y > (s.height + getRadius())) {
      y = -getRadius();
    }
    x += speedX;
    y += speedY;

  }
}
