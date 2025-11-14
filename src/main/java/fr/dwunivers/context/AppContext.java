package fr.dwunivers.context;

import fr.dwunivers.services.ReactionService;
import lombok.Getter;

@Getter
public class AppContext {
    private final ReactionService reactionService;

    public AppContext() {
        this.reactionService = new ReactionService();
    }
}
