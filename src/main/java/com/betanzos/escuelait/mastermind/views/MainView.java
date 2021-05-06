package com.betanzos.escuelait.mastermind.views;

public abstract class MainView {

    private GameView gameView;
    private ResumeView resumeView;
    private GoodbyeView goodbyeView;

    public MainView(GameView gameView, ResumeView resumeView, GoodbyeView goodbyeView) {
        this.gameView = gameView;
        this.resumeView = resumeView;
        this.goodbyeView = goodbyeView;
    }

    public void start() {
        gameView.show();
    }

    public boolean resume() {
        return resumeView.interact();
    }

    public void sayGoodBye() {
        goodbyeView.show();
    }
}
