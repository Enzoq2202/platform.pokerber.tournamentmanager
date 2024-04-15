package insper.store.tournamentmanager;

import lombok.Builder;
import lombok.experimental.Accessors;
import java.time.LocalDateTime;


@Builder
@Accessors(fluent = true, chain = true)
public record TournamentManagerOut (
    String id,
    String name,
    LocalDateTime startTime,
    String description
) { }

