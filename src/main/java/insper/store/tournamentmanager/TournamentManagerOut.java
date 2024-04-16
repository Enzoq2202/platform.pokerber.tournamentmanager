package insper.store.tournamentmanager;

import lombok.Builder;
import lombok.experimental.Accessors;
import java.time.LocalDateTime;
import java.util.List;


@Builder
@Accessors(fluent = true, chain = true)
public record TournamentManagerOut (
    String id,
    String name,
    LocalDateTime startTime,
    String description,
    List<PlayerOut> players
) { }


