package fr.dwunivers.constants;

public enum EnvironmentVariable {
    DISCORD_TOKEN("DISCORD_TOKEN");

    private final String key;
    EnvironmentVariable(String key) {
        this.key = key;
    }

    public String value() {
        return key;
    }

    public String get() {
        String key = System.getenv(this.key);
        return key != null ? key.trim() : null;
    }
}
