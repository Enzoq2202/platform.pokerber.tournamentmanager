package insper.store.tournamentmanager;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@FeignClient(name = "store-tournamentmanager")
@RequestMapping("/tournaments")
public interface TournamentManagerController {

    // Endpoint para criar um novo torneio
    @PostMapping(produces = "application/json")
    public ResponseEntity<TournamentManagerOut> createTournament(@RequestBody TournamentManagerIn tournamentIn);

    // Endpoint para adicionar um jogador a um torneio existente
    @PostMapping("/{tournamentId}/players")
    public ResponseEntity<Void> addPlayerToTournament(
        @PathVariable String tournamentId,
        @RequestBody PlayerIn playerIn
    );
    
    // Endpoint para obter informações de um torneio específico
    @GetMapping("/{tournamentId}")
    public ResponseEntity<TournamentManagerOut> getTournament(
        @PathVariable String tournamentId
    );

    // Endpoint para listar todos os jogadores em um torneio específico
    @GetMapping("/{tournamentId}/players")
    public ResponseEntity<List<PlayerOut>> listTournamentPlayers(
        @PathVariable String tournamentId
    );

    // Endpoint para remover um jogador de um torneio
    // @DeleteMapping("/{tournamentId}/players/{playerId}")
    // public ResponseEntity<Void> removePlayerFromTournament(
    //     @PathVariable String tournamentId,
    //     @PathVariable String playerId
    // );
}
