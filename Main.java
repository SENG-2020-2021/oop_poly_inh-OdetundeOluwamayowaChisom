import java.util.Scanner;
//Complete this program that the user will be able to choose the quadilateral it wants to calculate its perimeter and area

class Main {
  public static void main(String[] args) {
    char quad;
    //Declare a char to store the chosen quadilateral
      Scanner sc=new Scanner(System.in);
      Scanner scan = new Scanner(System.in);
        System.out.println
        ("1.Rhombus\n2.Square\n3.Trapezoid\n4.Rectangle\n5.Parallelogram");
        System.out.print("choose your :");
        quad=sc.next().charAt(0);
        
            //using a switch check what the user selected and use it to calculate the perimeter and area of the desired quadilateral
        switch(quad){ 
          case '1':
        System.out.println("Calculation for a Rhombus");
          System.out.println("Input first side");
          float a = scan.nextFloat();
          System.out.println("Input second side");
          float b = scan.nextFloat();
          System.out.println("Input third side");
          float c = scan.nextFloat();
          System.out.println("Input the fourth side");
          float d = scan.nextFloat();
          System.out.println("Input the first diagonal");
          float d1= scan.nextFloat();
          System.out.println("Input the second diagonal");
          float d2= scan.nextFloat();

          Rhombus r = new Rhombus(a ,b, c, d, d1, d2);
          System.out.printf("The perimeter of the Rhombus with First Side: %.2f,Second Side: %.2f, Third Side: %.2f, Fourth Side: %.2f, First Diagonal: %.2f and second Diagonal d %.2f is %.2f", a, b, c, d, d1, d2, r.area());
          break;

          case '2': 
          System.out.println("Square Calculation");
              System.out.println("Input the side");
            float ab = scan.nextFloat();
                  Square n = new Square(ab);
            System.out.printf("The perimeter of the Square with side: %.2f is %.2f", ab, n.calculatePerimeter());
            System.out.println("");
            System.out.printf("The area of the Square wuth side: %.2f is %.2f", ab, n.area());
          break;

          case '3':
        System.out.println("Trapezoid Calculation");
        System.out.println("Input length of first leg");
          float a1 = scan.nextFloat();
        System.out.println("Input Length of second leg");
          float a2 = scan.nextFloat();
        System.out.println("Input Length of first parallel side");
          float a3 = scan.nextFloat();
        System.out.println("Input Length of second parallel side");
          float a4 = scan.nextFloat();
        System.out.println("Input Height");
          float a5 = scan.nextFloat();
          Trapezoid t = new Trapezoid(a1, a2, a3, a4, a5);
        System.out.printf("The perimeter of the Trapezoid with first leg: %.2f, second leg: %.2f, first parallel side: %.2f, second parallel side: %.2f is %.2f", a1, a2, a3, a4, t.calculatePerimeter());
        System.out.println("");
        System.out.printf("The perimeter of the Trapezoid with first leg: %.2f, second leg: %.2f, first parallel side: %.2f, second parallel side: %.2f is %.2f", a1, a2, a3, a4, t.area());
        break;
        
        case '4':
        System.out.println("Rectangle calculation");
        System.out.println("Input Length");
          float b1 = scan.nextFloat();
        System.out.println("Input Breadth");
          float b2 = scan.nextFloat();
              Rectangle re = new Rectangle(b1, b2);
          System.out.printf("The perimeter of the rectangle with length: %.2f, and breadth %.2f is %.2f", b1, b2, re.calculatePerimeter());
          System.out.println("");
        System.out.printf("The area of the rectangle with length: %.2f, and breadth %.2f is %.2f", b1, b2, re.area());
        break;

    //this should be in the parallelogram case
        case '5':
        System.out.println("This program calculates the area and perimeter of the parallelogram.");
        System.out.println("Input the base of your Parallelogram");
          float pBase = scan.nextFloat();
        System.out.println("Input the height of your Parallelogram");
          float pHeight = scan.nextFloat();
        Parallelogram p = new Parallelogram(pBase, pHeight);
    
    Quadilateral q = p;

  
    System.out.println("Input the dimension of the first pair of your Parallelogram");
    q.setLength(scan.nextFloat());
    System.out.println("Input the second pair of your Parallelogram");
    q.setBreadth(scan.nextFloat());
    
    System.out.printf("The area of the parallelogram with base %.2f and height %.2f is %.2f", pBase, pHeight, p.Area());

    System.out.println("");
    System.out.printf("The perimeter of the parallelogram with First Pair: %.2f and SecondPair: %.2f is %.2f", q.getLength(), q.getBreadth(), q.calculatePerimeter());
    System.out.println("");
    System.out.println("");
    System.out.println("");

    //this should be in the Trapezoid case
    default: System.out.println("this is not a valid input");
    }
  }
}


//Create class for Rhombus
class Rhombus extends Quadilateral{
  private float side1;
  private float side2;
  private float side3;
  private float side4;
  private float diag1;
  private float diag2;

public Rhombus (float a, float b, float c, float d, float e, float f){
  side1= a;  
  side2=b;
  side3=c;
  side4=d;
  diag1=e;
  diag2=f;
  
}
public float calculatePerimeter(){
  return side1+side2+side3+side4;
}
public float area(){
  return (diag1*diag2)/2;
}
}


//Create class for square
class Square extends Quadilateral{
  private float side1;

public Square (float a){
  if(a <= 0){
    System.out.println("You cannot have a negative or zero base. Therefore base returns to default which is 1");
    a = 1;
  }
  else 
    side1 = a;
}

public float calculatePerimeter(){
  return 4*side1;
}
public float area(){
  return side1*side1;
}
}


//create class for Rectangle
class Rectangle extends Quadilateral{
  private float length;
  private float breadth;

  public Rectangle(float l, float b){
     length = l;
     breadth = b;
  }
  public float area(){
    return length*breadth;
  }
  public float calculatePerimeter(){
    return 2*(length*breadth);
  }
  }


class Trapezoid extends Quadilateral{
  private float side1;
  private float side2;
  private float side3;
  private float side4;
  private float side5;

  public Trapezoid (float a, float b, float c, float d, float e){
    side1 = a;
    side2 = b;
    side3 = c;
    side4 = d;
    side5 = e;
  }

  public float calculatePerimeter(){
    return side1+side2+side3+side4;
  }
  public float area(){
    return ((side3+side4)/2)*side5;
  }
}


class Parallelogram extends Quadilateral{
  private float base;
  private float height;
  public Parallelogram (float b, float h){
    if (b <= 0){
      System.out.println("You cannot have a negative or zero base. Therfore base returns to 0default which is 1");
      base = 1;
    }
    else
      base = b;
    if (h <= 0){
      System.out.println("You cannot have a negative or zero height. Therfore height returns to default which is 1");
      height = 1;
    }
    else
      height = h;
  }
  public float Area(){
    return base*height;
  }

}


class Quadilateral {
  private float length;
  private float breadth;

  public void setLength(float l){
    length = l;
  }

  public float getLength(){
    return length;
  }

  public void setBreadth(float b){
    breadth = b;
  }

  public float getBreadth(){
    return breadth;
  }

  public float calculatePerimeter(){
    return 2*(length+breadth);
  }
}


