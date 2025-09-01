package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class HeloWorld extends OpMode {

    @Override
    public void init() {
        telemetry.addData("Hello","World"); //This is a comment
    }

    @Override
    public void loop() {

    }
}
