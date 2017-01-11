package robot;

import edu.wpi.first.wpilibj.DriverStation;

public class Controller {
	public enum ControllerButton {
		A(1),
		B(2),
		X(3),
		Y(4),
		LB(5),
		RB(6),
		START(7),
		SELECT(8),
		LSTICK(9),
		RSTICK(10),
		UP(11),
		DOWN(12),
		LEFT(13),
		RIGHT(14);
		
		private byte value;
		ControllerButton(int value) {
			this.value = (byte) value;
		}
		public byte value() {
			return this.value;
		}
	}
	public enum ControllerAxis {
		LeftX(1),
		LeftY(2),
		RightX(3),
		RightY(4),
		LTrigger(5),
		RTrigger(6);
		
		private byte value;
		
		ControllerAxis(int value) {
			this.value = (byte) value;
		}
		public byte value() {
			return this.value;
		}
	}
}
