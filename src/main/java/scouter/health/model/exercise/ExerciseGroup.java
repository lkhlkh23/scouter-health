package scouter.health.model.exercise;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExerciseGroup {

	private int exerciseId;
	private String exerciseName;
	private String exerciseKind;
	private boolean usable;

}
