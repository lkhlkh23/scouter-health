package scouter.health.config;

import static org.junit.jupiter.api.Assertions.*;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JasyptConfigTest {

	@Autowired
	private StandardPBEStringEncryptor sut;

	@Test
	void test_encrypt() {
		// given
		final String text = "password";

		// when
		final String result = sut.encrypt(text);

		// then
		assertNotNull(result);
	}
}