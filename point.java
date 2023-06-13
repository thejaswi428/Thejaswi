public class Point 
{
double x;
double y;
public void setX(double x_value){x=x_value;}
public void setY(double y_value){y=y_value;}
public double getX(){return x;}
public double getY(){return y;}
public double Square_distane_from_origin()
{return x*x+y*y}
}
class TestPoint
{
Point P;
P=new Point();