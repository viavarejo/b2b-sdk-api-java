package br.com.via.api.security;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import br.com.via.api.CriptografiaException;

public class Encryptor {
	private String chavePublica;

	public Encryptor(String chavePublica) {
		this.chavePublica = chavePublica;
	}

	public final String encript(String inputData) {
		try {
			String certBase64 = chavePublica;
			byte[] certBytes = Base64.getDecoder().decode(certBase64.getBytes());

			CertificateFactory certFactory;
			certFactory = CertificateFactory.getInstance("X.509");
			InputStream in = new ByteArrayInputStream(certBytes);
			X509Certificate cert = (X509Certificate) certFactory.generateCertificate(in);

			Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
			cipher.init(Cipher.ENCRYPT_MODE, cert.getPublicKey());
			byte[] encryptedBytes = cipher.doFinal(inputData.getBytes(StandardCharsets.UTF_8));

			return Base64.getEncoder().encodeToString(encryptedBytes);
		} catch (CertificateException | NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException
				| IllegalBlockSizeException | BadPaddingException e) {
			throw new CriptografiaException(e);
		}
	}
}
