package scouter.health.controller.v1.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import scouter.health.controller.v1.dto.ExerciseGroupV1;
import scouter.health.model.exercise.ExerciseGroup;

@Mapper
public interface ExerciseGroupV1Mapper {

	ExerciseGroupV1Mapper INSTANCE = Mappers.getMapper(ExerciseGroupV1Mapper.class);

	@Mappings({
		@Mapping(source = "exerciseId", target = "exerciseId"),
		@Mapping(source = "exerciseName", target = "exerciseName"),
		@Mapping(source = "exerciseKind", target = "exerciseKind")
	})
	ExerciseGroupV1 toDto(final ExerciseGroup domain);

}
