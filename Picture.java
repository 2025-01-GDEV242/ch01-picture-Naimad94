/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * The image in the draw() method is a small house on a green hill in the
 * of nowhere, the setting is at night.
 * 
 * @author  Damian Nunez
 * @version 2025.02.02
 */
public class Picture
{
    private Square wall;
    private Square door;
    private Square sky;
    private Triangle roof;
    private Circle moon;
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
        door = new Square();
        roof = new Triangle();  
        moon = new Circle();
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
            
            moon.changeColor("yellow");
            moon.moveHorizontal(100);
            moon.moveVertical(-40);
            moon.changeSize(80);
            moon.makeVisible();
            
            
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
            
            door.changeColor("black");
            door.moveHorizontal(-120);
            door.moveVertical(60);
            door.changeSize(40);
            door.makeVisible();
            
            person.moveHorizontal(-200);
            person.moveVertical(20);
            person.makeVisible();
            
            drawn = true;
        }
    }
    
    public void sunset()
    {
        moon.slowMoveVertical(300);
        person.slowMoveHorizontal(80);
    }
    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("white");
        grass.changeColor("black");
        person.changeColor("white");
        wall.changeColor("black");
        door.changeColor("white");
        roof.changeColor("black");
        moon.changeColor("black");
    }
    
    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        door.changeColor("black");
        roof.changeColor("green");
        moon.changeColor("yellow");
    }
}
