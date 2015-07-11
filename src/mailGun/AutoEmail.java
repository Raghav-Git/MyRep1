package mailGun;

import java.awt.PageAttributes.MediaType;

public class AutoEmail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

		/*
		public static ClientResponse SendSimpleMessage() {
		    Client client = Client.create();
		    client.addFilter(new HTTPBasicAuthFilter("api",
		                "key-df49bf3503adb0691a9d7b3e5b544739"));
		    WebResource webResource =
		        client.resource("https://api.mailgun.net/v3/sandboxce7d8e684fdf41f4896db1e9cf674e6c.mailgun.org/messages");
		    MultivaluedMapImpl formData = new MultivaluedMapImpl();
		    formData.add("from", "Mailgun Sandbox <postmaster@sandboxce7d8e684fdf41f4896db1e9cf674e6c.mailgun.org>");
		    formData.add("to", "Raghav <automation.impulse@gmail.com>");
		    formData.add("subject", "Hello Raghav");
		    formData.add("text", "Congratulations Raghav, you just sent an email with Mailgun!  You are truly awesome!  You can see a record of this email in your logs: https://mailgun.com/cp/log .  You can send up to 300 emails/day from this sandbox server.  Next, you should add your own domain so you can send 10,000 emails/month for free.");
		    return webResource.type(MediaType.APPLICATION_FORM_URLENCODED).
		                                                post(ClientResponse.class, formData);
		}
		  */  
		
		
	
	
}
