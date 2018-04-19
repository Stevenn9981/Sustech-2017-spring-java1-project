package »úÆ±Ô¤¶©ÏµÍ³;

public enum Company {
	CA("CA"),
	MU("MU"),
	CZ("CZ"),
	HU("HU"),
	ZH("ZH");
		
		private final String company;
		
	     public String getCompany() {
			return company;
		}

		Company(String a){
			company = a;
		}
			public static Company getCompany(String s2){
				Company Newcom = null;
				if (s2.equals("CA")) {
					Newcom = Company.CA;
				}
				if (s2.equals("MU")) {
					Newcom = Company.MU;
				}
				if (s2.equals("CZ")) {
					Newcom =Company.CZ;
				}
				if (s2.equals("HU")) {
					Newcom = Company.HU;
				}
				if (s2.equals("ZH")) {
					Newcom = Company.ZH;
				}
				return Newcom;
			}
		}

