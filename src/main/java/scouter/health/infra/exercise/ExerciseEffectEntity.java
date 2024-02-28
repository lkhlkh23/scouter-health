package scouter.health.infra.exercise;

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
@Table(name = "exercise_effect")
public class ExerciseEffectEntity {

	@Id
	@Column(name = "exercise_effect_id")
	private int exerciseEffectId;

	@Column(name = "exercise_id")
	private int exerciseId;

	@Column(name = "exercise_part_id")
	private int exercisePartId;

	@Column(name = "created_date")
	private LocalDateTime createdAt;

	@Column(name = "updated_date")
	private LocalDateTime updatedAt;
}
