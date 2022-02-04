package frc.robot.subsystems.lights.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.lights.AddressableLEDs;
import frc.robot.subsystems.lights.enums.ValuesToColors;


public class SetReadyToShoot extends CommandBase {

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        setIndexerColor(YELLOW);
    }
    
    @Override 
    public void end() {
        
    }

}