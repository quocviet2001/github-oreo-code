package lap14.command.pseudocode;

import java.util.HashMap;
import java.util.Map;

public class Shortcuts {
    private Map<String, Action> map = new HashMap<>();

    public void onKeyPress(String shortcut, Action action) {
        map.put(shortcut, action);
    }

    public void onPress(String shortcut) {
        if (map.containsKey(shortcut)) {
            map.get(shortcut).perform();
        }
    }
}
