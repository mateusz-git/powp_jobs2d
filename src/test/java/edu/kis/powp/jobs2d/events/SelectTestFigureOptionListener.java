package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private FigureJoe figureJoe;
	public SelectTestFigureOptionListener(DriverManager driverManager,FigureJoe figureJoe ) {
		this.driverManager = driverManager;
		this.figureJoe = figureJoe;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (figureJoe) {
			case FIGURE1:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case FIGURE2:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
	}
}

