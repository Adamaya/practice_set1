package inheritance;

//class Object1 {
//    double h = 10;
//    double d = 10;
//    double g = 10;
//}

class Object2 {
    double height;
    double density;
    double gravity;

    public Object2(Object2 ob) {
        height = ob.height;
        gravity = ob.gravity;
        density = ob.density;
    }

    public Object2() {
        height = 10;
        density = 10;
        gravity = 10;
    }

}

public class ObjectConstructor extends Object2 {
    public static void main(String[] args) {
        double density;
        ObjectConstructor(ObjectConstructor ob) {
            super(ob)
        }
    }
}
