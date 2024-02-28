package scouter.health.infra.user;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
