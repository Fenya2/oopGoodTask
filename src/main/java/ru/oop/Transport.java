package ru.oop;

/**
 * Описывает поведение транспорта.
 */
public interface Transport {
    /**
     * Транспорт не хоть куда доедет, поэтому едет до ближайшей от пункта назначения точки.
     * @return точку, куда доехал.
     */
    void goToNearest(Position destination);
}
