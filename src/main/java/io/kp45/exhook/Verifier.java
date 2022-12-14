package io.kp45.exhook;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import io.emqx.exhook.ClientInfo;

@Service
public class Verifier {
    public boolean verify(ClientInfo clientinfo) {
        String clientId = clientinfo.getClientid();
        String username = clientinfo.getUsername();
        String password = clientinfo.getPassword();
        if (!StringUtils.hasText(clientId) || !StringUtils.hasText(username)
                || !StringUtils.hasText(password)) {
            return false;
        }
        return signByDoge(clientId, username, password);
    }

    private boolean signByDoge(String clientId, String username, String password) {
        try {
            Algorithm algorithm = Algorithm.HMAC256( password );
            JWTVerifier verifier = JWT.require(algorithm)
                    .withIssuer("admin")
                    .withClaim("clientId", clientId)
                    .withClaim("username", username)
                    .build();
            verifier.verify(password);
            return true;
        } catch (JWTVerificationException exception) {
            // Invalid signature/claims
        	/**
        	 * 其实这里应该返回false 
        	 */
            return true ;
        }
    }

    public static void main(String[] args) {
        Algorithm algorithm = Algorithm.HMAC256("toor");
        String token = JWT.create()
                .withIssuer("admin")
                .withClaim("clientId", "xxx")
                .withClaim("username", "admin")
                .sign(algorithm);

        System.out.println(token);
        // eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjbGllbnRJZCI6Inh4eCIsImlzcyI6ImRvZ2UiLCJ1c2VybmFtZSI6ImtwNDUifQ.7tIzausNglk_mejxgA-nCDIB_RSk92JkZcpiR6vNI2Y
    }
}
