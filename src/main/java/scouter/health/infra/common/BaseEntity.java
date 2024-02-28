package scouter.health.infra.common;

import java.time.LocalDateTime;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseEntity {

	@Column(name = "created_date", nullable = false)
	private LocalDateTime createdAt;

	@Column(name = "uddated_date", nullable = false)
	private LocalDateTime updatedAt;

}
