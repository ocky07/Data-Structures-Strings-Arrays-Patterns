package com.prudhvi.MultiLevelInheritance;

public class MIxpl {

	

	public static void main(String[] args) {
		System.out.println("family accessing the their properties\t::6\n");
		System.out.println("The grand father accessing own\t:P R O P E R T I E S\n");
		GD_fATHER.all_properties_accessing();
		System.out.println("The father accessing father\t:P R O P E R T I E S\n  -------------------------- = O = -------------------------");
		father.all_properties_accessing();
		System.out.println("The grand son accessing grand father\t:P R O P E R T I E S\n  -------------------------- = O = -------------------------");
		GD_son.all_properties_accessing();
	}

}
class GD_fATHER 
{
static	int hotels=5;
static	String land="50 acrs";
static	String villa="party villa";
static long saving=1000000000;
static	int privatejet=5;
static	int cars=10;
public static void hotelsaccess() {
	System.out.println("1.  Any time i can access the hotels facilities\t:"+hotels);
}
public static void landfarmming() {
	System.out.println("2.  I can formming the sessinal crafts in my land\t:"+land);
}

public static void villaaccessingtime() {
	System.out.println("3.  If i'm free in weekends,then im going to relaxing my villa\t:"+villa);
}
public static void bankbals() {
	System.out.println("4.  my back balance is\t:"+saving);
}
public static void jet() {
	System.out.println("5.  travelling to the long distance or other contries\t:"+privatejet);
}
public static void car() {
	System.out.println("6.  based on the my mood to travelling the short distance\t:"+cars);
}
public static void all_properties_accessing() {
	GD_fATHER G=new GD_fATHER();
	G.hotelsaccess();
	G.landfarmming();
	G.villaaccessingtime();
	G.bankbals();
	G.jet();
	G.car();
	
} 
}
class father extends GD_fATHER
{
	
}
class GD_son extends father
{

}