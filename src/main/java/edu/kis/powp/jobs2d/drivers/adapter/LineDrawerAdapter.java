package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter implements Job2dDriver {
    private int startX = 0, startY = 0;
    private DrawPanelController drawPanelController;
    private ILine iLine;

    public LineDrawerAdapter(DrawPanelController drawPanelController, ILine iLine) {
        this.drawPanelController = drawPanelController;
        this.iLine = iLine;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        iLine.setStartCoordinates(this.startX, this.startY);
        iLine.setEndCoordinates(x, y);
        drawPanelController.drawLine(iLine);
        setPosition(x, y);
    }

    @Override
    public String toString() {
        return "LineDrawerAdapter";
    }
}
