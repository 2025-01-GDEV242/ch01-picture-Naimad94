/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Damian Nunez
 * @version 2025.02.02
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square sky;
    private Triangle roof;
    private Circle sun;
    private Circle grass;
    private Person person;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        sky = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        grass = new Circle();
        person = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) 
        {   
            sky.changeColor("blue");
            sky.moveHorizontal(-400);
            sky.moveVertical(-200);
            sky.changeSize(1000);
            sky.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            grass.changeColor("green");
            grass.moveHorizontal(-500);
            grass.moveVertical(100);
            grass.changeSize(1000);
            grass.makeVisible();
            
            wall.moveHorizontal(-140);
            wall.moveVertical(-20);
            wall.changeSize(120);
            wall.makeVisible();
            
            roof.changeSize(60,180);
            roof.moveHorizontal(20);
            roof.moveVertical(-80);
            roof.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(60);
            window.changeSize(40);
            window.makeVisible();
            
            person.moveHorizontal(-200);
            person.moveVertical(20);
            person.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }
    
    public void sunset()
    {
        sun.slowMoveVertical(300);
        person.slowMoveHorizontal(80);
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
