package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class FiguresFactory {
    public static DriverCommand square(Job2dDriver driver) {
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(0, 0, driver));
        commandList.add(new OperateToCommand(0, 150, driver));
        commandList.add(new OperateToCommand(150, 150, driver));
        commandList.add(new OperateToCommand(150, 0, driver));
        commandList.add(new OperateToCommand(0, 0, driver));
        return new ComplexCommand(commandList);
    }

    public static DriverCommand rhombus(Job2dDriver driver) {
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(-200, -50, driver));
        commandList.add(new OperateToCommand(-100, 100, driver));
        commandList.add(new OperateToCommand(150, 100, driver));
        commandList.add(new OperateToCommand(50, -50, driver));
        commandList.add(new OperateToCommand(-200, -50, driver));
        return new ComplexCommand(commandList);
    }

    public static DriverCommand triangle(Job2dDriver driver) {
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(0, 0, driver));
        commandList.add(new OperateToCommand(80, 180, driver));
        commandList.add(new OperateToCommand(180, 0, driver));
        commandList.add(new OperateToCommand(0, 0, driver));
        return new ComplexCommand(commandList);
    }

    public static DriverCommand rectangle(Job2dDriver driver) {
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(0, 0, driver));
        commandList.add(new OperateToCommand(0, 180, driver));
        commandList.add(new OperateToCommand(60, 180, driver));
        commandList.add(new OperateToCommand(60, 0, driver));
        commandList.add(new OperateToCommand(0, 0, driver));
        return new ComplexCommand(commandList);
    }
}