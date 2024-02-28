package scouter.health.infra.user;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import scouter.health.infra.common.converter.BooleanToYNConverter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "user_main")
@Entity
public class UserMainEntity {

	@Id
	@Column(name = "user_id")
	private String userId;

	@Column(name = "user_role")
	private String role;

	@Convert(converter = BooleanToYNConverter.class)
	@Column(name = "use_yn")
	private Boolean usable;

	@Column(name = "created_date", nullable = false)
	private LocalDateTime createdAt;

	@Column(name = "updated_date", nullable = false)
	private LocalDateTime updatedAt;

}
