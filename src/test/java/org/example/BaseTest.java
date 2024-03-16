package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public abstract class BaseTest {
    protected Game game;

    @BeforeEach
    public void setUp() {
        game = new Game();
    }

    @AfterEach
    public void tearDown() {
        // Здесь может быть код для очистки ресурсов, если это необходимо.
        // В текущей реализации игры специфических действий для очистки не требуется.
    }
}