package org.example;

public class Game {
    private boolean[] doors = {false, false, false}; // Предполагаем, что приз за одной из дверей
    private int prizeDoor;
    private int chosenDoor;

    public Game() {
        // Инициализация игры
        prizeDoor = (int) (Math.random() * 3); // Определяем, за какой дверью приз
        doors[prizeDoor] = true;
    }

    public void chooseDoor(int door) {
        if (door < 0 || door > 2) {
            throw new IllegalArgumentException("Invalid door number: " + door);
        }
        chosenDoor = door;
    }

    public boolean changeChoice() {
        int doorToShow = -1;
        for (int i = 0; i < doors.length; i++) {
            if (i != chosenDoor && !doors[i]) {
                doorToShow = i; // Ведущий показывает дверь без приза
                break;
            }
        }

        // Смена выбора на оставшуюся дверь
        for (int i = 0; i < doors.length; i++) {
            if (i != chosenDoor && i != doorToShow) {
                chosenDoor = i;
                break;
            }
        }

        return doors[chosenDoor]; // Возвращаем результат смены выбора
    }

    public boolean isWinWithoutChange() {
        // Проверка выигрыша без смены выбора
        return doors[chosenDoor];
    }
}