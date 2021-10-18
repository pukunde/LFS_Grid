package com.NFK.support;




	import java.lang.reflect.Field;
	import java.lang.reflect.Modifier;
	import java.net.HttpURLConnection;

	import com.qmetry.qaf.automation.ws.rest.RestClientFactory;
	import com.sun.jersey.api.client.Client;
	import com.sun.jersey.api.client.config.ClientConfig;
	import com.sun.jersey.api.client.config.DefaultClientConfig;
	import com.sun.jersey.client.urlconnection.URLConnectionClientHandler;
	import com.sun.jersey.multipart.impl.MultiPartWriter;

	public class MyClient  extends RestClientFactory{
		
		@Override
		protected Client createClient() {

			ClientConfig config = new DefaultClientConfig();
			config.getProperties().put(URLConnectionClientHandler.PROPERTY_HTTP_URL_CONNECTION_SET_METHOD_WORKAROUND, true);
			config.getClasses().add(MultiPartWriter.class);

			try {
				Field methodsField = HttpURLConnection.class.getDeclaredField("methods");
				methodsField.setAccessible(true);
				Field modifiersField = Field.class.getDeclaredField("modifiers");

				modifiersField.setAccessible(true);
				System.out.println("methods Fields::" + methodsField);
				modifiersField.setInt(methodsField, methodsField.getModifiers() & ~Modifier.FINAL);

				String[] methods ={"GET","POST","HEAD","OPTIONS","PUT","DELETE","TRACE","PATCH"};
				methodsField.set(null, methods);
				System.out.println("Methods set");
				
			} catch (Exception e) {
				System.out.println("Exceptipn in setting the methods");
			}

			return Client.create(config);
		}
	}

