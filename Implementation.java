interface InterfaceWithDefault {
    void firstMethod();
    void secondMethod();
    default void newMethod() {
        System.out.println("newMethod");
    }
}

public class Implementation implements InterfaceWithDefault {
    public void firstMethod() {
        System.out.println("firstMethod");
    }
    public void secondMethod() {
        System.out.println("secondMethod");
    }
    public static void main(String[] args) {
      InterfaceWithDefault i = new Implementation();
      i.firstMethod();
      i.secondMethod();
      i.newMethod();
    }
}
