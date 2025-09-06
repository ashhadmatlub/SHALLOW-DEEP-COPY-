import controller.deep_copy_controller.AppDeep;
import controller.shallow_copy_controller.App;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        // ----------------- Shallow Copy --------------------
        // System.out.println("--------- This is Shallow Copy ----------");
        // App shallowApp = new App();
        // shallowApp.run();

        // --------------------- Deep Copy ----------------
        System.out.println("--------- This is Deep Copy ----------");
        AppDeep deepApp = new AppDeep();
        deepApp.runDeepCopy();

    }
}
