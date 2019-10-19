package TestScript;

public class Stringsplit  {

	public static void main(String[] args) {
		/* String  e= "p8 2019";
		 String[] split1 = e.split(" ");
		 System.out.println(split1[0]+" "+split1[1]);
		 
		 String []split2= split1[0].split("p");
		 System.out.println(split2[1]);*/
		 
		 
		/*String e="252/3 (20 Overs, RR: 12.6)"; 
		String[] split1= e.split(" ");
		System.out.println(split1[0]+" "+split1[1]);
		 String value= split1[0];
		 System.out.println(split1[0]);*/
		 
	
		

		/*String e ="252/3 (20 Overs, RR: 12:6)" ;
		 String[] split1 = e.split(" ");
		 System.out.println(split1[0]+"" +split1[1]);
		 String [] split2 = split1[1].split("\\(");
		 System.out.println(split2[1]);*/
		 
		 
		String e="252/3 (20 Overs, RR: 12.6)";
		
		String[] split1 = e.split("\\,");
		System.out.println(split1[0]+" " +split1[1]);
		 String[] split2 =split1[1].split(":");
		 System.out.println(split2[0]);
		 
	}
}





