package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest extends BaseTest {

    @Test
    public void testWinRateWithChange() {
        int winsWithChange = 0;
        int totalGames = 10000;

        for (int i = 0; i < totalGames; i++) {
            game.chooseDoor((int) (Math.random() * 3));
            if (game.changeChoice()) winsWithChange++;
            setUp(); // Переинициализируем игру для следующего цикла
        }

        double winRate = (double) winsWithChange / totalGames;
        Assertions.assertTrue(winRate > 0.65, "Win rate with change should be greater than 65%");
    }

    @Test
    public void testWinRateWithoutChange() {
        int winsWithoutChange = 0;
        int totalGames = 10000;

        for (int i = 0; i < totalGames; i++) {
            game.chooseDoor((int) (Math.random() * 3));
            if (game.isWinWithoutChange()) winsWithoutChange++;
            setUp(); // Переинициализируем игру для следующего цикла
        }

        double winRate = (double) winsWithoutChange / totalGames;
        Assertions.assertTrue(winRate < 0.35, "Win rate without change should be less than 35%");
    }
}