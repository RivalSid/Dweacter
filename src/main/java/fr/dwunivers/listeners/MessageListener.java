package fr.dwunivers.listeners;

import fr.dwunivers.context.AppContext;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MessageListener extends ListenerAdapter {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageListener.class);
    private final AppContext context;

    public MessageListener(final AppContext context) {
        this.context = context;
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (!event.getAuthor().isBot()) {
            final Message message = event.getMessage();
            context.getReactionService().reactToMessage(message);
        }
    }
}
