package com.betanzos.escuelait.mastermind.views.graphic;

import com.betanzos.escuelait.mastermind.views.MainView;

public final class GraphicMainView extends MainView {

    public GraphicMainView() {
        super(new GraphicGameView(), new GraphicResumeView(), new GraphicGoodbyeView());
    }
}
