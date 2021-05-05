package com.betanzos.escuelait.mastermind;

public final class MasterMind {

    public void play() {
        do {
            new Game().start();
        } while (isResumed());

        Console console = new Console();
        console.writeln();
        console.writeln("GOOD BYE!!!");
    }

    private boolean isResumed() {
        Console console = new Console();
        String answer;
        do {
            answer = console.readString("RESUME? (y/n): ");
        } while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"));

        return answer.equalsIgnoreCase("y");
    }

    public static void main(String[] args) {
        new MasterMind().play();
    }
}
