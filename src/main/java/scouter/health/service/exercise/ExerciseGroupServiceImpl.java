package scouter.health.service.exercise;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import scouter.health.model.exercise.ExerciseGroup;
import scouter.health.repository.exercise.ExerciseGroupRepository;

@Service
@RequiredArgsConstructor
public class ExerciseGroupServiceImpl implements ExerciseGroupService {

	private final ExerciseGroupRepository exerciseGroupRepository;
	@Override
	@Transactional(readOnly = true)
	public List<ExerciseGroup> getAllExerciseGroups() {
		return exerciseGroupRepository.getAllExerciseGroups();
	}

}
