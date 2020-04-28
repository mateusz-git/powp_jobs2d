package edu.kis.powp.command;

import java.util.List;

public class ComplexCommand implements DriverCommand {
    private List<DriverCommand> driverCommandList;

    public ComplexCommand(List<DriverCommand> driverCommandList) {
        this.driverCommandList = driverCommandList;
    }

    @Override
    public void execute() {
        driverCommandList.forEach(DriverCommand::execute);
    }
}
