import java.awt.*;
import java.awt.event.*;
class adapter extends Frame
{
TextField t;
Label l;
Button b1;
adapter()
{
t=new TextField(12);
l=new Label("fgh");
b1=new Button("click");
setLayout(new FlowLayout());
add(t);
add(l);
add(b1);
addMouseListener(new MouseAdapter()
{
public void mouseEntered(MouseEvent m)
{
t.setText("entered");
}
public void mouseExited(MouseEvent m)
{
t.setText("exited");
}
public void mouseClicked(MouseEvent m)
{
t.setText("clicked");
}
public void mousePressed(MouseEvent m)
{
t.setText("presssed");
}
});
pack();
show();
}
public static void main(String args[])
{
adapter a=new adapter();
}
}
