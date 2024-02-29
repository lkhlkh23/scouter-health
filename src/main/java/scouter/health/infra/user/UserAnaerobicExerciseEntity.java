package scouter.health.infra.user;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user_exercise")
public class UserAnaerobicExerciseEntity {

	@Id
	@Column(name = "user_exercise_id")
	private int userExerciseId;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "calendar_date")
	private String calendarAt;

	@Column(name = "exercise_id")
	private int exerciseId;

	@Column(name = "exercise_weight")
	private int exerciseWeight;

	@Column(name = "exercise_set")
	private int exerciseSet;

	@Column(name = "exercise_repeat")
	private int exerciseRepeat;

	@Column(name = "created_date")
	private LocalDateTime createdAt;

	@Column(name = "updated_date")
	private LocalDateTime updatedAt;
}
