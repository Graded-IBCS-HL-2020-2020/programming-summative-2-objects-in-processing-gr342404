class Ball {
  private Sketch s;
  private float diameter;
  private float x;
  private float y;
  private int col;
  private float speedY;
  private float speedX;
  private int borderColor;


  public Ball(Sketch sketch) {
    s = sketch;
    diameter = s.random(50, 150); // random diameter between 50 and 150
    x = s.random(diameter / 2, s.width - diameter / 2);
    y = s.random(diameter / 2, s.height - diameter / 2);
    col = s.randomColor(false);
    speedX = s.random(-5, 10);
    speedY = s.random(-5, 10);

  }
  

    
  public Ball(Sketch sketch, float X, float Y, float ballDiam, int ballColor, float sx, float sy, int borderBall){

    s = sketch;
    x = X;
    y = Y;
    diameter = ballDiam;
    col = ballColor;
    speedX = sx;
    speedY = sy;
    borderColor = borderBall;

  }


  public float getRadius() {

    return diameter / 2;
  }

  public void stop() {
    speedX = 0;
    speedY = 0;

  }

  public void start() {
    speedX = s.random(-3, 8);
    speedY = s.random(-3, 8);
  }


  public void drawBall() {

    s.stroke(borderColor);
    s.fill(col);
    s.ellipse(x, y, diameter, diameter);
  }


  public void moveBall() {


    if (x > (s.width - getRadius()) || x < getRadius()) {
      speedX = -speedX;
    }
    if (y > (s.height - getRadius()) || y < getRadius()) {
      speedY = -speedY;
    }
    
    x += speedX;
    y += speedY;
  }
}