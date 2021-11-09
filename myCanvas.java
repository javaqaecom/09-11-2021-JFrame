import java.awt.*;

public class myCanvas extends Canvas {
    //DATA

    //Func
    @Override
    public void paint(Graphics g) {
        /*g.setColor(Color.BLUE);
        g.drawLine(0,0,300,200);
        //targel
        g.setColor(Color.red);
        g.drawLine(300,200,600,0);

        g.setColor(Color.red);
        g.drawRect(50,50,100,50);

        g.fillRect(50,50,100,50);*/
        Shape[] shapes = new Shape[6];
        shapes[0]= new Circle(Color.red,
                50,50,40);
        shapes[1]= new Circle(Color.green,
                150,50,40);
        shapes[2]= new Circle(Color.pink,
                350,50,40);
        shapes[3]= new rectangle(Color.cyan,
                200,300,150,49);
        shapes[4]= new rectangle(Color.blue,
                200,400,150,49);
        shapes[5]= new rectangle(Color.yellow,
                200,200,150,49);

       for (Shape s: shapes)
           s.draw(g);

    }
}
