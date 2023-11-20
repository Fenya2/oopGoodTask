package ru.oop;

/**
 * Человек
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public interface Person extends Positioned {

    /**
     * Пройти до указанного места из текущего местоположения
     *
     * @param destination место назначения
     */
    void walk(Position destination);

    /**
     * Садится в транспорт
     */
    void getIn(Transport transport);

    /**
     * Выходит из транпорта
     */
    void getOff();

    /**
     * Находит подходящий, для своих целей, транспорт.
     *
     * @return найденный транспорт
     */
    Transport findSuitableTransport();
}
