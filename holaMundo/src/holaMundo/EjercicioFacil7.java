package holamundo;

public class EjercicioFacil7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int nu1 = 2;
	int nu2 = 8;
	int nu3 = 9;
	
	if( (nu1>nu2) && (nu2>nu3) ){
		System.out.println("orden: nu1,nu2,nu3");
	}
		
	else if ((nu1>nu3) && (nu3>nu2)) {
		System.out.println("orden:nu1,nu3,nu2");
	}
		
	else if ((nu2>nu1) && (nu1>nu3)) {
		System.out.println("orden:nu2,nu1,nu3");
	}
		
	else if ((nu2>nu3) && (nu3>nu1)) {
		System.out.println("orden:nu2,nu3,nu1");
	}
		
	
	else if  ((nu3>nu1) && (nu1>nu2)) {
		System.out.println("orden:nu3,nu1,nu2");
	}
	
	else if ((nu3>nu2) && (nu2>nu1)) {
		System.out.println("orden:nu3,nu2,nu1");
	}
	
	
	
	
	}

}
