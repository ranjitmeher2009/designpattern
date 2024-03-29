package designpattern.structural.decorator.shape;

public interface Shape {
    void draw();

    void resize();

    String description();

    boolean isHide();
}