package scouter.health.type;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum UserRoleType {

	GUEST("GUEST", "방문자"),
	NORMAL("NORMAL", "일반 사용자"),
	ADMIN("ADMIN", "관리자");

	private String role;
	private String description;

	public static UserRoleType getUserRoleType(final String role) {
		for (final UserRoleType value : values()) {
			if(value.role.equals(role)) {
				return value;
			}
		}

		return null;
	}

}
