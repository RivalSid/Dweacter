package fr.dwunivers.services;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.emoji.Emoji;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReactionService {
    private static final Logger LOGGER =  LoggerFactory.getLogger(ReactionService.class);
    private static final String DEFAULT_EMOJI = "\uD83D\uDD25";

    public Emoji getDefaultEmoji() {
        return Emoji.fromUnicode(DEFAULT_EMOJI);
    }

    public void reactToMessage(Message message) {
        final Emoji emoji = getDefaultEmoji();
        message.addReaction(emoji).queue(
                success -> LOGGER.info("Added reaction {} to message {}", emoji, message.getId()),
                error -> LOGGER.error("Failed to add reaction", error)
        );
    }

}
