package com.betanzos.escuelait.mastermind.utils;

import java.util.Scanner;

public final class Console {

    public static final Console IO = new Console();

    private static final Scanner SCANNER = new Scanner(System.in);

    private Console() {

    }

    public String readString(String title) {
        assert title != null;
        System.out.print(title);
        return SCANNER.nextLine();
    }

    public void writeln(String string) {
        assert string != null;
        System.out.println(string);
    }
}
