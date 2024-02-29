package scouter.health.controller.v1;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import scouter.health.controller.v1.dto.ExerciseGroupV1;
import scouter.health.controller.v1.dto.ExerciseGroupsV1;
import scouter.health.controller.v1.mapstruct.ExerciseGroupV1Mapper;
import scouter.health.model.exercise.ExerciseGroup;
import scouter.health.service.exercise.ExerciseGroupService;
import scouter.health.type.ExerciseType;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/api")
public class ExerciseGroupApiController {

	private final ExerciseGroupService exerciseGroupService;

	@GetMapping("/exercises")
	public List<ExerciseGroupV1> getExercises() {
		return exerciseGroupService.getAllExerciseGroups().stream()
								   .map(ExerciseGroupV1Mapper.INSTANCE::toDto)
								   .collect(Collectors.toList());
	}

}
