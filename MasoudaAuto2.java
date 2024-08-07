
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;


@Autonomous

public class MasoudaAuto2 extends LinearOpMode {
    DcMotor frontLeft;
    DcMotor frontRight;
    DcMotor backLeft;
    DcMotor backRight;



    public void runOpMode() {
      frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
      frontRight = hardwareMap.get(DcMotor.class, "frontRight");
      backLeft = hardwareMap.get(DcMotor.class, "backLeft");
      backRight = hardwareMap.get(DcMotor.class, "backRight");
    
    backLeft.setDirection(DcMotor.Direction.REVERSE);
    waitForStart();
      
      while (opModeIsActive()){
         frontLeft.setPower(-0.7);
         frontRight.setPower(0.7);
         backLeft.setPower(0.7);
         backRight.setPower(0.7);
          sleep(1000);
          
      }

    }
    
}
