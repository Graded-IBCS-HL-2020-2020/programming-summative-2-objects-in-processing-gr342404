class Snowflake {

  private Sketch s;
  private float diameter;
  private float x;
  private float y;
  private int col;
  private float speedY;
  private float speedX;

  public Snowflake(Sketch sketch) {
    s = sketch;
    diameter = s.random(40, 50);
    x = s.random(diameter / 2, s.width - diameter / 2);
    y = s.random(diameter / 2, s.height - diameter / 2);
    col = s.color(255, 150);
    speedX = s.random(3, 4);
    speedY = s.random(4, 5);
  }

  public Snowflake(Sketch sketch, float X, float Y, float snowDiam, int snowColor, float sx, float sy) {

    s = sketch;
    x = X;
    y = Y;
    diameter = snowDiam;
    col = snowColor;
    speedX = sx;
    speedY = sy;
  }

  public float getRadius() {
    return diameter / 2;
  }

  public void drawSnowflake() {
    s.stroke(col);
    s.line(x - getRadius() / 2, y - getRadius() / 2, x + getRadius() / 2, y + getRadius() / 2);
    s.line(x - getRadius() / 2, y + getRadius() / 2, x + getRadius() / 2, y - getRadius() / 2);
    s.line(x - getRadius(), y, x + getRadius(), y);
    s.line(x, y - getRadius(), x, y + getRadius());
  }

  public void moveSnowflake() {
    if (x > (s.width - getRadius()) || x < getRadius()) {
      speedX = -speedX;
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
