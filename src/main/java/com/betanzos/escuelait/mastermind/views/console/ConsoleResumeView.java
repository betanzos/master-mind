package com.betanzos.escuelait.mastermind.views.console;

import com.betanzos.escuelait.mastermind.utils.Console;
import com.betanzos.escuelait.mastermind.views.ResumeView;

public final class ConsoleResumeView implements ResumeView {

    @Override
    public boolean interact() {
        String answer;
        do {
            answer = Console.IO.readString("RESUME? (y/n): ");
        } while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"));

        return answer.equalsIgnoreCase("y");
    }
}
