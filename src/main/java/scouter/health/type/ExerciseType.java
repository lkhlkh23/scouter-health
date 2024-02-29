package scouter.health.type;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum ExerciseType {

	ANAEROBIC("01", "무산소"),
	AEROBIC("02", "유산소");

	private String code;
	private String name;

	public static boolean isAnaerobic(final String code) {
		return ANAEROBIC.code.equals(code);
	}

	public static boolean isAerobic(final String code) {
		return AEROBIC.code.equals(code);
	}

}
