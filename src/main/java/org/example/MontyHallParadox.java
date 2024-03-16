package org.example;

public class MontyHallParadox {
    public static void main(String[] args) {
        int winsWithChange = 0;
        int totalGames = 10000;

        for (int i = 0; i < totalGames; i++) {
            Game game = new Game();
            game.chooseDoor((int) (Math.random() * 3));
            if (game.changeChoice()) winsWithChange++;
        }

        System.out.println("Wins with change: " + winsWithChange);
        System.out.println("Total games: " + totalGames);
    }
}