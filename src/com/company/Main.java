package com.company;

public class Main {

    public static void main(String[] args) {
        Transport car = new Transport() {
            @Override
            void doBeep() {
                // логика
            }
        };
        car.doBeep();



        Bus vw = new Bus();
        vw.doBeep();

        Fish shark = new Fish();
        shark.say();
        shark.canFly();
        shark.canSwim();

        AnimalTransport dog = new AnimalTransport() {
            @Override
            public void say() {

            }

            @Override
            public void canSwim() {

            }

            @Override
            public void canFly() {

            }

            @Override
            public void canRun() {

            }
        };
        dog.say();

    }
}
