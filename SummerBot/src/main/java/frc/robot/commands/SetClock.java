package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Main;
import frc.robot.subsystems.Clock.ClockPreset;

public class SetClock extends Command {

    private ClockPreset clockPreset;

    public SetClock(ClockPreset clockPreset){
        requires(Main.clock);
        this.clockPreset = clockPreset;
    }

    @Override
    protected void initialize() {
    }
  
    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
      Main.clock.setPosition(clockPreset);
    }
  
    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
      return false;
    }
  
    // Called once after isFinished returns true
    @Override
    protected void end() {
    }
  
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}
