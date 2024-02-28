package scouter.health.service;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import scouter.health.infra.user.UserMainEntity;
import scouter.health.model.User;
import scouter.health.repository.UserMainEntityRepository;
import scouter.health.type.UserRoleType;
import scouter.health.util.HttpSessionUtil;

@Slf4j
@Component
@RequiredArgsConstructor
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

	private final UserMainEntityRepository userMainRepository;
	private final HttpSession httpSession;

	@Override
	@Transactional
	public OAuth2User loadUser(final OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
		final OAuth2User oAuth2User = super.loadUser(userRequest);
		final User user = registerUser((String) oAuth2User.getAttributes().get("email"));
		HttpSessionUtil.getInstance().setSession(httpSession, user);

		return oAuth2User;
	}

	private User registerUser(final String userId) {
		final Optional<UserMainEntity> user = userMainRepository.findById(userId);
		if(user.isPresent()) {
			return User.from(user.get());
		}

		final LocalDateTime current = LocalDateTime.now();
		final UserMainEntity entity = UserMainEntity.builder()
													.userId(userId)
													.role(UserRoleType.NORMAL.getRole())
													.usable(true)
													.createdAt(current)
													.updatedAt(current)
													.build();
		return User.from(userMainRepository.save(entity));
	}

}
