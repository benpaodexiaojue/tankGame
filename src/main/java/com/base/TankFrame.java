package com.base;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame{
    private int x = 200;
    private int y = 200;

    public TankFrame(){
        setTitle("坦克大战");
        setSize(800, 600);
        setResizable(false);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        this.addKeyListener(new MyKeyListener());

    }

    @Override
    public void paint(Graphics g){
        g.fillRect(x, y, 40, 30);
    }

    class MyKeyListener extends KeyAdapter{
        /**
         * Invoked when a key has been keyPressed.
         */
        @Override
        public void keyPressed(KeyEvent e) {
            x += 10;
            repaint();
        }

        /**
         * Invoked when a key has been released.
         */
        @Override
        public void keyReleased(KeyEvent e) {
            y += 10;
            repaint();
        }
    }


}
