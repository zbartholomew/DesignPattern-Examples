package com.zbartholomew.example3;

class CarBuilderImpl implements CarBuilder {
    private Car car;

    public CarBuilderImpl() {
        car = new Car();
    }

    @Override
    public CarBuilder setWheels(final int wheels) {
        car.setWheels(wheels);
        return this;
    }

    @Override
    public CarBuilder setColor(final String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}