package insper.store.tournamentmanager;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record PlayerOut(
    String playerId,
    String playerName
){}
