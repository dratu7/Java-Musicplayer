package TUI.Menus.Options;

import java.util.HashMap;

public enum SongOption {
    PAUSE("pa", "Pause"),
    CONTINUE("co", "Continue"),
    JUMP("ju", "Jump"),
    SKIP("sk", "Skips"),
    REWIND("re", "Rewind"),
    CLEAR("cl", "Clear"),
    QUIT("q", "Quit"),
    HELP("?", "Help");

    // this part is the same in all Option Enums
    // EXCEPTIONS: Name of constructor, Type in HasMap, in static for loop, return Type of getByKey
    private final String KEY;
    private final String DESCRIPTION;

    private static final HashMap<String, SongOption> KEY_MAP = new HashMap<>();
    private static final String HELP_STRING;

    SongOption(String KEY, String DESCRIPTION) {
        this.KEY = KEY;
        this.DESCRIPTION = DESCRIPTION;
    }

    static {
        StringBuilder strB = new StringBuilder();
        for(SongOption option: values()) {
            KEY_MAP.put(option.KEY, option);
            strB.append(option.KEY).append(": ").append(option.DESCRIPTION).append(String.format("%n"));
        }
        HELP_STRING = strB.toString();
    }

    public static SongOption getByKey(String key) {
        return KEY_MAP.get(key);
    }

    public static String getHelpString() {
        return HELP_STRING;
    }
}