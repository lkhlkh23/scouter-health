package scouter.health.controller.v1.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseGroupsV1 {

	private List<ExerciseGroupV1> anaerobicExercises;
	private List<ExerciseGroupV1> aerobicExercises;

}
