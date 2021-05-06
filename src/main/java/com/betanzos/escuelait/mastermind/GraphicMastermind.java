package com.betanzos.escuelait.mastermind;

import com.betanzos.escuelait.mastermind.views.graphic.GraphicMainView;

public class GraphicMastermind extends Mastermind {

    private GraphicMastermind() {
        super(new GraphicMainView());
    }

    public static void main(String[] args) {
        new GraphicMastermind().play();
    }
}
