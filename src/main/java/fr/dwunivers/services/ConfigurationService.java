package fr.dwunivers.services;

import fr.dwunivers.constants.EnvironmentVariable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigurationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConfigurationService.class);

    public static String getDiscordToken() {
        final String token = EnvironmentVariable.DISCORD_TOKEN.get();
        if (token == null || token.isBlank()) {
            LOGGER.warn("Missing DISCORD_TOKEN environment variable.");
            throw new IllegalStateException("Missing DISCORD_TOKEN environment variable");
        }
        return token;
    }
}
