package »úÆ±Ô¤¶©ÏµÍ³;

public enum City {

   Beijing("Beijing"),
   Shenzhen("Shenzhen"),
   Shanghai("Shanghai"),
   NewYork("NewYork"),
   London("London");
	
	private final String city;
	
     public String getCity() {
		return city;
	}

	City(String a){
		city = a;
	}
	public static City getCity(String s2){
		City Newacity = null;
		if (s2.equals("Beijing")) {
			Newacity = City.Beijing;
		}
		if (s2.equals("Shenzhen")) {
			Newacity = City.Shenzhen;
		}
		if (s2.equals("Shanghai")) {
			Newacity = City.Shanghai;
		}
		if (s2.equals("NewYork")) {
			Newacity = City.NewYork;
		}
		if (s2.equals("London")) {
			Newacity = City.London;
		}
		return Newacity;
	}
}
