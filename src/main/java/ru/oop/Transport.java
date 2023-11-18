package ru.oop;

public interface Transport extends Positioned {
    /**
     * Перемещается до ближайшей к пункту назначения точке.
     */
    void goToNearest(Position destination);
}
