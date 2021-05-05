package com.betanzos.escuelait.mastermind.utils;

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
}
