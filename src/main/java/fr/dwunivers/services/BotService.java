package fr.dwunivers.services;

import fr.dwunivers.context.AppContext;
import fr.dwunivers.listeners.MessageListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BotService {
    private final String token;
    private JDA jda;
    private static final Logger LOGGER = LoggerFactory.getLogger(BotService.class);
    private final AppContext context;

    public BotService(String token, AppContext context) {
        this.token = token;
        this.context = context;
    }

    public void start() throws Exception {
        LOGGER.info("Starting Dweacter Bot...");
        jda = JDABuilder.createDefault(token)
                .enableIntents(
                        GatewayIntent.GUILD_MESSAGES,
                        GatewayIntent.MESSAGE_CONTENT
                )
                .setActivity(Activity.playing("playing with his poppy"))
                .addEventListeners(new MessageListener(context))
                .build();

        jda.awaitReady();
        LOGGER.info("Bot is online as: {}", jda.getSelfUser().getName());
    }

    public void shutdown() {
        if (jda != null) {
            jda.shutdown();
            LOGGER.info("Bot shut down cleanly.");
        }
    }
}
