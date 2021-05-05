package com.betanzos.escuelait.mastermind;

import java.util.Scanner;

public final class Console {

    private static final Scanner SCANNER = new Scanner(System.in);

    public String readString(String title) {
        assert title != null;
        System.out.print(title);
        return SCANNER.nextLine();
    }

    public void writeln(String string) {
        assert string != null;
        System.out.println(string);
    }

    public void writeln() {
        System.out.println();
    }

    public void write(String string) {
        assert string != null;
        System.out.print(string);
    }
}
