package frc.robot.subysystems.intake;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;

public class Intake extends SubsystemsBase {
    
    // Maintains the motor for the intake
    public final CANSparkMax rollerMotor;

    // Maintains the motor for the intake
    public final Solenoid rectractionMotor;

    // Checks to seee if the intake has been retracted
    public boolean isRetracted = false;

    public Intake() {
        this.rollerMotor = new CANSparkMax(0, MotorType.kBrushless);
        this.rectractionMotor = new Solenoid(REVPH, 1);
    }

    // Sets the power of the rollers
    public void indexerRollerPower() {
        if (isRetracted) {
            rollerMotor.set(0);
        }
        else {
            rollerMotor.set(50);
        }
    }

    // Retracts the motor depending on if a button was pressed
    public void retractMototor() {
        if (buttonHasBeenPressed) {
            if (isRetracted) {
                rectractionMotor.set(true);
            }
            if (isRetracted) {
                rectractionMotor.set(false);
            }
        }
    }

}