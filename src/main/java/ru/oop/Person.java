package ru.oop;

/**
 * Человек
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public interface Person {

    /**
     * Текущее местоположение
     */
    Position getPosition();

    /**
     * Пройти до указанного места из текущего местоположения
     *
     * @param destination место назначения
     */
    void walk(Position destination);

    /**
     * Садится в транспорт, если тот находится там же, где сам человек
     */
    void getIn(Transport transport);

    /**
     * Выходит из транспорта
     */
    void getOff();
}
