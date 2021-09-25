package week3.day2.interfaceassignment;

public class Desktop implements Hardware,Software {

	public void desktopModel()
	{
		System.out.println("Desktop Model: HP");
	}
	
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Software Resources");
		
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Hardware Resources");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop obj=new Desktop();
		obj.softwareResources();
		obj.hardwareResources();
		obj.desktopModel();
		

	}

	

}
