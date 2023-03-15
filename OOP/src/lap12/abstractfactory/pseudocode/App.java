package lap12.abstractfactory.pseudocode;

public class App {
    public static void main(String[] args) throws Exception {
        String configOS = System.getProperty("os.name").toLowerCase();;
        GUIFactory factory;
        if (configOS.contains("win")) {
            factory = new WindowsFactory();
        } else if (configOS.contains("mac")) {
            factory = new MacFactory();
        } else {
            throw new Exception("Error! Unknown OS type");
        }
        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }
}
