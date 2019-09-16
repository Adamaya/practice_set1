package inheritance;

class Object1 {
    double h = 10;
    double d = 10;
    double g = 10;
}

class Object2 extends Object1 {
    double height;
    double density;
    double gravity;

    public Object2(Object2 ob) {
        height = ob.h;
        gravity = ob.g;
        density = ob.d;
    }

}
public class ObjectConstructor {

}
