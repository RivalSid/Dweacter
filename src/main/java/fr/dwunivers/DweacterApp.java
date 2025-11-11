package fr.dwunivers;

import fr.dwunivers.services.BotService;
import fr.dwunivers.services.ConfigurationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DweacterApp {

  private static final Logger LOGGER = LoggerFactory.getLogger(DweacterApp.class);

  public static void main(String[] args) {
    try {
      final String token = ConfigurationService.getDiscordToken();
      new BotService(token).start();
    } catch (Exception e) {
      LOGGER.error("Failed to start bot: {}", e.getMessage());
      System.exit(1);
    }
  }
}
