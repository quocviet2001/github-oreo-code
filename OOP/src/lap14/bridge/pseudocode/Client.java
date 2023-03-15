package lap14.bridge.pseudocode;

public class Client {
    public static void main(String[] args) {
        System.out.println("Tests with basic remote.");
        TV tv = new TV();
        RemoteControl remote = new RemoteControl(tv);
        remote.togglePower();
        System.out.println(tv.getVolume());
        remote.volumeDown();
        System.out.println(tv.getVolume());

        System.out.println("\nTests with advanced remote.");
        Radio radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.togglePower();
        advancedRemote.mute();
        System.out.println(radio.getVolume());
    }
}
