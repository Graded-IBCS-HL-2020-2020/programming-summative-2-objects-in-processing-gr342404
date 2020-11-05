
/** MAKE SURE TO READ THE README CAREFULLY BEFORE YOU BEGIN EDITING THIS CODE */
import processing.core.PApplet;

public class Sketch extends PApplet {

    /*
     * SUMMATIVE REQUIRED Declare at least four balls, four bubbles, and four
     * snowflakes as instance variables. I have made the first ball for you.
     * 
     * SUMMATIVE OPTIONAL Use *arrays* to store the elements, rather than individual
     * variables.
     */

      Ball b1;
      Ball b2;
      Ball b3;
      Ball b4; 

      Bubble bu1;
      Bubble bu2;
      Bubble bu3;

      Snowflake sn1;
      Snowflake sn2;
      Snowflake sn3;
      Snowflake sn4;

    

    public void settings() {
        size(500, 500);
    }

    /*
     * SUMMATIVE REQUIRED Initialize the balls, bubbles, and snowflakes using your
     * constructors inside of setup(). You must use a non-default-constructor at
     * least once and a default constructor at least once for each type.
     * 
     * I have done the first ball for you.
     */
    public void setup() {
        frameRate(30);
        b1 = new Ball(this);
        b2 = new Ball(this);
        b3 = new Ball(this);
        b4 = new Ball(this);
        
        bu1 = new Bubble(this);
        bu2 = new Bubble(this);
        bu3 = new Bubble(this);

        sn1= new Snowflake(this);
        sn2= new Snowflake(this);
        sn3= new Snowflake(this);
        sn4= new Snowflake(this);
        
        
    }

    public void draw() {
        background(100);

        /* SUMMATIVE REQUIRED Draw and move all balls, snowflakes, and bubbles */
        b1.drawBall();
        b1.moveBall();
        b2.drawBall();
        b2.moveBall();
        b3.drawBall();
        b3.moveBall();
        b4.drawBall();
        b4.moveBall();  


        bu1.drawBubble();
        bu1.moveBubble();
        bu2.drawBubble();
        bu2.moveBubble();
        bu3.drawBubble();
        bu3.moveBubble();

        sn1.drawSnowflake();
        sn1.moveSnowflake();
        sn2.drawSnowflake();
        sn2.moveSnowflake();
        sn3.drawSnowflake();
        sn3.moveSnowflake();
        sn4.drawSnowflake();
        sn4.moveSnowflake();
        
        
    }

    /**
     * Convenience method to return a random color
     * 
     * @param transluscent if true, make the color transluscent, otherwise solid
     */
    public int randomColor(boolean transluscent) {
        int alpha;
        if (transluscent) {
            alpha = 125;
        } else {
            alpha = 255;
        }
        return color(random(0, 255), random(0, 255), random(0, 255), alpha);
    }

    /*
     * SUMMATIVE OPTIONAL Add a void method called mousePressed() that stops some or
     * all of the balls from moving when you click the mouse. (it will run
     * automatically when you click if the name is correct)

     public void mouseClicked(){
       if (value == 0) {
         value = 255;
         } else {
        value = 0; 
        }

       

     }
     * 
     * EXTRA CHALLENGE - can you make it so that only the ball you actually CLICKED
     * stops? (this is a major challenge - you can use the variables mouseX and
     * mouseY to see where the mouse was clicked.)
     */

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
