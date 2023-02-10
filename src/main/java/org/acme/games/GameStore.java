package org.acme.games;

import org.acme.contracts.Game;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

public class GameStore {

    public List<Game> searchGames(String name) {
        try {
            List<Game> games = getGames();
            return games.stream()
                    .filter(game -> {
                        if (game.name() != null) {
                            return game.name().toLowerCase().contains(name.toLowerCase());
                        }
                        return false;
                    })
                    .toList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private List<Game> getGames() {
        List<Game> games = new ArrayList<>();
        Game residentEvil = new Game(UUID.randomUUID(), "Resident Evil", 1996);
        games.add(residentEvil);
        Game residentEvil2 = new Game(UUID.randomUUID(), "Resident Evil 2", 1998);
        games.add(residentEvil2);
        Game residentEvil3 = new Game(UUID.randomUUID(), "Resident Evil 3", 1999);
        games.add(residentEvil3);
        Game residentEvilremake = new Game(UUID.randomUUID(), "Resident Evil Remake", 2002);
        games.add(residentEvilremake);
        Game residentEvil2remake = new Game(UUID.randomUUID(), "Resident Evil 2 remake", 2019);
        games.add(residentEvil2remake);
        Game residentEvil3remake = new Game(UUID.randomUUID(), "Resident Evil 3 remake", 2020);
        games.add(residentEvil3remake);
        Game deadSpace = new Game(UUID.randomUUID(), "Dead Space", 2008);
        games.add(deadSpace);
        Game deadSpaceremake = new Game(UUID.randomUUID(), "Dead Space Remake", 2023);
        games.add(deadSpaceremake);
        Game superMariobros = new Game(UUID.randomUUID(), "Super Mario Bros.", 1985);
        games.add(superMariobros);
        Game superMariobros3 = new Game(UUID.randomUUID(), "Super Mario Bros. 3", 1988);
        games.add(superMariobros3);
        Game theLegendofzelda = new Game(UUID.randomUUID(), "The Legend of Zelda", 1986);
        games.add(theLegendofzelda);
        Game residentEvilrevelations = new Game(UUID.randomUUID(), "Resident Evil Revelations", 2012);
        games.add(residentEvilrevelations);
        Game houseOfthedead2 = new Game(UUID.randomUUID(), "House of the Dead 2", 1998);
        games.add(houseOfthedead2);
        Game luigisMansion = new Game(UUID.randomUUID(), "Luigi's Mansion", 2001);
        games.add(luigisMansion);
        Game luigisMansion2 = new Game(UUID.randomUUID(), "Luigi's Mansion 2", 2013);
        games.add(luigisMansion2);
        Game luigisMansion3 = new Game(UUID.randomUUID(), "Luigi's Mansion 3", 2019);
        games.add(luigisMansion3);
        Game residentEvil7 = new Game(UUID.randomUUID(), "Resident Evil 7", 2017);
        games.add(residentEvil7);
        Game residentEvil8 = new Game(UUID.randomUUID(), "Resident Evil 8", 2021);
        games.add(residentEvil8);
        Game grimFandango = new Game(UUID.randomUUID(), "Grim Fandango", 1998);
        games.add(grimFandango);
        Game left4Dead2 = new Game(UUID.randomUUID(), "Left 4 Dead 2", 2009);
        games.add(left4Dead2);
        Game dinoCrisis = new Game(UUID.randomUUID(), "Dino Crisis", 1999);
        games.add(dinoCrisis);
        Game crashBandicoot1 = new Game(UUID.randomUUID(), "Crash Bandicoot 1", 1996);
        games.add(crashBandicoot1);
        Game crashBandicoot2 = new Game(UUID.randomUUID(), "Crash Bandicoot 2", 1997);
        games.add(crashBandicoot2);
        Game crashBandicootremake = new Game(UUID.randomUUID(), "Crash Bandicoot remake", 2017);
        games.add(crashBandicootremake);
        Game doom = new Game(UUID.randomUUID(), "Doom", 1993);
        games.add(doom);
        Game doom3 = new Game(UUID.randomUUID(), "Doom 3", 2004);
        games.add(doom3);
        Game doom2016 = new Game(UUID.randomUUID(), "Doom 2016", 2016);
        games.add(doom2016);
        Game doomEternal = new Game(UUID.randomUUID(), "Doom Eternal", 2020);
        games.add(doomEternal);
        Game quake1 = new Game(UUID.randomUUID(), "Quake 1", 1996);
        games.add(quake1);
        Game dieHardtrilogy = new Game(UUID.randomUUID(), "Die Hard Trilogy", 1996);
        games.add(dieHardtrilogy);
        return games;

    }

}
