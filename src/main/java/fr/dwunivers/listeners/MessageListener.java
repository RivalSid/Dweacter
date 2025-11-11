package fr.dwunivers.listeners;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (!event.getAuthor().isBot()) {
            Message message = event.getMessage();
            String content = message.getContentRaw().trim();
            if (content.equalsIgnoreCase("!ping")) {
                event.getChannel().sendMessage("Pong!").queue();
            }
        }
    }
}
