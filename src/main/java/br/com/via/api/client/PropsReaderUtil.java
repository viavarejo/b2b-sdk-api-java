package br.com.via.api.client;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropsReaderUtil {
	private static final Logger LOGGER = Logger.getLogger(PropsReaderUtil.class.getName());
	private String fileName = "config.properties";

	public String getHost() {
		return getSingleProp("host");
	}

	public String getToken() {
		return getSingleProp("token");
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public String getSingleProp(String propertieName) {
		String token = null;
		try {
			token = getProp().getProperty(propertieName);
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, null, e);
		}
		return token;
	}

	private Properties getProp() throws IOException {
		Properties prop = new Properties();

		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
		try {
			prop.load(inputStream);
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, null, e);
		} finally {
			inputStream.close();
		}
		return prop;
	}
}
