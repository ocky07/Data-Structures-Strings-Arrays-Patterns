package com.prudhvi.Hierarchical;

public class HIxpl {

	public static void main(String[] args) {	
	}
     
}

class Loverfrnds{
static String enjoying="crazy things doing";
 public static void cheer() {
	 System.out.println("Togethere and enjoying"+enjoying);
 }
}


class Lover extends Loverfrnds {
static	String love="lot's of love";
static	String kiss="more and more";
static	String romance="extream level";
	public static void wantLOVE() {
		System.out.println("always giving to you baby\t:"+love);
	}
	public static void wantKISS() {
		System.out.println("always giving to you baby\t:"+kiss);
	}
	public static void wantROMANCE() {
		System.out.println("I can do with you only baby\t:"+romance);
	}
	
}
class First_Boyfriend extends Lover
{
static	String money="Full Bank Balance";
static	String shopping="All Types";
static	String dance="Disco";
static	String dring="No";
	public static void asking_for_money() {
		System.out.println("how much amount you want take\t:"+money);
	}
	public static void asking_for_cloths() {
		System.out.println("want you want take it,dont think for price ('-')\t:"+shopping);
	}
	public static void asking_for_dancing() {
		System.out.println("yeah, we dance and enjoy the present movement\t:"+dance);
	}
	public static void asking_for_dring() {
		System.out.println("NO, i don't have drinking habit sorry\t:"+dring);
	}
	
}
class firstBoyfriend_friend extends Lover
{
static	String money="Full Bank Balance";
static	String shopping="All Types";
static	String dance="Disco";
static	String dring="yes";
	public static void asking_for_money() {
		System.out.println("how much amount you want take\t:"+money);
	}
	public static void asking_for_cloths() {
		System.out.println("want you want take it,dont think for price ('-')\t:"+shopping);
	}
	public static void asking_for_dancing() {
		System.out.println("yeah, we dance and enjoy the present movement\t:"+dance);
	}
	public static void asking_for_dring() {
		System.out.println("yeah, i like drinking with baby\t:"+dring);
	}
	
}

class LoverBro extends Loverfrnds{
	
	private void depending_thing() {
		System.out.println("conning to other peoples and also parents");

	}
	
}