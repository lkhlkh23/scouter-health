package scouter.health.infra.exercise;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import scouter.health.infra.common.converter.BooleanToYNConverter;

@Getter
@Setter
@Entity
@Table(name = "exercise_group")
public class ExerciseGroupEntity {

	@Id
	@Column(name = "exercise_id")
	private int exerciseId;

	@Column(name = "exercise_nm")
	private String exerciseName;

	@Convert(converter = BooleanToYNConverter.class)
	@Column(name = "use_yn")
	private boolean usable;

	@Column(name = "created_date")
	private LocalDateTime createdAt;

	@Column(name = "updated_date")
	private LocalDateTime updatedAt;

}
