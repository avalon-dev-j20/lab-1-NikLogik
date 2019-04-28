package ru.avalon.java.j20.labs.models;

/**
 * Модель представления о точке.
 */
public class Point<T extends Number> {
    /**
     * Абсцисса точки.
     */
    private final T x;
    /**
     * Ордината точки.
     */
    private final T y;

    /**
     * Основной конструктор класса.
     *
     * @param x абсцисса точки
     * @param y ордината точки
     */
    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает абсциссу точки.
     *
     * @return x-координата точки.
     */
    public T getX() {
        return x;
    }

    /**
     * Возвращает ординату точки.
     *
     * @return y-координата точки.
     */
    public T getY() {
        return y;
    }

    /**
     * Возвращает дистанцию от точки до точки.
     *
     * @param point точка, до которой следует вычислить
     *              дистанцию.
     * @return дистанция между точками
     */
    public double distanceTo(Point<?> point) {
        float dx = x.floatValue() - point.x.floatValue();
        float dy = y.floatValue() - point.y.floatValue();
        return (double) Math.sqrt(dx * dx + dy * dy);
    }
}
