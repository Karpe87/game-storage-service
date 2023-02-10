package org.acme.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.acme.contracts.Game;
import org.acme.games.GameStore;

import java.util.List;

@Path("/games")
public class GameResource {
    private final GameStore gameStore;

    public GameResource() {
        this.gameStore = new GameStore();
    }


    @GET
    @Path("search/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public List<Game> search(String name) {
        return this.gameStore.searchGames(name);
    }

    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Game-Storage";
    }
}