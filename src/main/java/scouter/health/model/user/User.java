package scouter.health.model.user;

import static scouter.health.type.UserRoleType.*;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import scouter.health.infra.user.UserMainEntity;
import scouter.health.type.UserRoleType;

@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class User {

	public static final User GUEST_USER = new User("", false, UserRoleType.GUEST);

	private String userId;
	private boolean usable;
	private UserRoleType userRole;

	public static User from(final UserMainEntity entity) {
		return User.builder()
				   .userId(entity.getUserId())
				   .usable(entity.getUsable())
				   .userRole(getUserRoleType(entity.getRole()))
				   .build();
	}

	public boolean isLoginUser() {
		return !(this.userRole == UserRoleType.GUEST);
	}

}
