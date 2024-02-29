package scouter.health.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import lombok.RequiredArgsConstructor;
import scouter.health.service.CustomOAuth2UserService;
import scouter.health.type.UserRoleType;

@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	private final CustomOAuth2UserService oauthService;

	@Override
	protected void configure(final HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.headers().frameOptions().disable()
			.and()
			.authorizeRequests()
			.antMatchers("/css/**", "/js/**", "/img/**", "/v1/**").permitAll()
			// .antMatchers("/v1/api/**").hasRole(UserRoleType.NORMAL.getRole())
			.anyRequest().authenticated()
			.and()
			.oauth2Login()
			.defaultSuccessUrl("/v1/view/calendar")
			.userInfoEndpoint()
			.userService(oauthService);
	}

}
