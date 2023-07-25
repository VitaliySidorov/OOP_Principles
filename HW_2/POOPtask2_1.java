package HW_2;

// 1)Добавить пять интерфейсов к классам из ДЗ 1, включающих все концепции, 
// упомянутые на семинаре. включающих:
// - интерфейсы,
// - константы,
// - default методы,
// - перегрузки и переопределения методов.Вы можете выбрать любой класс из ДЗ 1 
// и добавить к нему интерфейсы. Вам также предоставляется возможность добавить 
// новые методы или использовать уже существующие методы в классе.

import HW_2.Shape.Circle;
import HW_2.Shape.Rectangle;
import HW_2.Shape.Triangle;

public class POOPtask2_1 {
    public static void main(String[] args) {

        Shape r1 = new Shape(5, 3, 8);
        r1.Show();

        Shape r2 = new Rectangle(4, 15, 50);
        r2.Show();
        
        Shape r3 = new Circle(20);
        r3.Show();

        Shape r4 = new Triangle(3, 15, 20);
        r4.Show();

        Shape r5 = new Shape();
        r5.Show();

    }
    
}
