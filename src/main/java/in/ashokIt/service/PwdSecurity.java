package in.ashokIt.service;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdSecurity {

	public String encodePwd(String pwd) {
		Encoder encoder=Base64.getEncoder();
		byte[] encode=encoder.encode(pwd.getBytes());
		
		String encodePwd=new String(encode);
		return encodePwd;
	}
}
