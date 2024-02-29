package scouter.health.repository.exercise;

import static scouter.health.infra.exercise.QExerciseGroupEntity.*;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;
import scouter.health.model.exercise.ExerciseGroup;

@RequiredArgsConstructor
@Repository
public class ExerciseGroupRepositoryImpl implements ExerciseGroupRepository {

	private final JPAQueryFactory factory;
	@Override
	public List<ExerciseGroup> getAllExerciseGroups() {
		return factory.select(Projections.fields(ExerciseGroup.class,
						  exerciseGroupEntity.exerciseId.as("exerciseId"),
						  exerciseGroupEntity.exerciseName.as("exerciseName"),
						  exerciseGroupEntity.exerciseKind.as("exerciseKind")))
					  .from(exerciseGroupEntity)
					  .where(exerciseGroupEntity.usable.eq(Boolean.TRUE))
					  .orderBy(exerciseGroupEntity.exerciseName.asc())
					  .fetch();
	}

}
