package scouter.health.filter;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import scouter.health.model.User;
import scouter.health.util.HttpSessionUtil;

public class LoginUserHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {

	@Override
	public boolean supportsParameter(final MethodParameter parameter) {
		return parameter.hasParameterAnnotation(LoginUser.class);
	}

	@Override
	public Object resolveArgument(final MethodParameter parameter,
								  final ModelAndViewContainer mavContainer,
								  final NativeWebRequest webRequest,
								  final WebDataBinderFactory binderFactory) {
		final User user = HttpSessionUtil.getInstance().getUserFromSession(webRequest);
		if(user.isLoginUser()) {
			return user;
		}

		throw new SecurityException("권한이 없습니다!");
	}

}
