package scouter.health.infra.user;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import scouter.health.infra.common.BaseEntity;
import scouter.health.infra.common.converter.BooleanToYNConverter;

@Getter
@Setter
@Table(name = "user_main")
@Entity
public class UserMainEntity extends BaseEntity {

	@Id
	@Column(name = "user_id")
	private String userId;

	@Convert(converter = BooleanToYNConverter.class)
	@Column(name = "use_yn")
	private Boolean usable;

}
