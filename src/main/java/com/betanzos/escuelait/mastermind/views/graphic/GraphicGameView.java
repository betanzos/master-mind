package com.betanzos.escuelait.mastermind.views.graphic;

import com.betanzos.escuelait.mastermind.views.GameView;

import javax.swing.*;

public final class GraphicGameView implements GameView {

    @Override
    public void show() {
        JOptionPane.showMessageDialog(
                null,
                "La interfaz gráfica no ha sido implementada aún",
                "Información",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
