package ru.oop;

/**
 * Задача: нужно добраться человеку на <b>машине</b> до заданного места.<br>
 * Но не всегда можно подъехать прямо к нужному(=заданному) месту, может понадобиться дойти пешком.<br>
 * Человек знает своё текущее местоположение (у него есть метод {@link Person#getPosition()}<br>
 * <p>
 * <ul>
 *   <li>Код не должен превышать 6 строк</li>
 *   <li>Запрещено реализовывать конструкторы и методы, кроме moveTo(Person person, Position destination)</li>
 *   <li>Запрещено добавлять новые методы в класс Main</li>
 *   <li>Разрешено создавать новые классы и интерфейсы</li>
 * </ul>
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public class Main {

    /**
     * Переехать из текущего места в заданную точку
     */
    public static void moveTo(Person person, Position destination) {
        Transport car = new Car(person.getPosition());
        person.getIn(car); // Надо бы прописать исключение, если сесть не может.
        car.goToNearest(destination);
        person.getOff();
        person.walk(destination);
        assert person.getPosition() == destination;
    }
}
