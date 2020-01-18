public class ClassLoader {

    // in what order will these statements print?

    static {
        System.out.println("static");
    }

    public ClassLoader() {
        System.out.println("constructor");
    }

    public void print() {
        System.out.println("method");
    }

    public static void main(String[] args) {
        System.out.println("main");
        ClassLoader cl = new ClassLoader();
        cl.print();
    }
}
