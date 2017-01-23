package signalAttendance;

import java.util.ArrayList;

public class attendance {
public static void main(String[] ARGS){
ArrayList<String> signal = new ArrayList <String>();

signal.add("Park Hae-young");
signal.add("Cha Soo-hyun");
signal.add("Lee Jae-han");
signal.add("Kim Bum-joo");
signal.add("Ahn Chi-soo");

System.out.println(signal.get(0)+"'s brother dies as suicide(the truth is "
		+ signal.get(3)+" killed Park Hae-young's brother)");
System.out.println("Kim yoon-young kidnap case happens.");
System.out.println(signal.get(2)+ " goes missing (dies) while investigating the Inju incident and the corruption behind it.");
signal.remove("Lee Jae-han");

signal.add("Lee Jae-han");
System.out.println(signal.get(0)+" in the present receives a walkie-talkie call from "+signal.get(2)+ " in the past.");
System.out.println(signal.get(signal.indexOf("Park Hae-young"))+" solves Kim yoon-young kidnap case with the help of solves Kim yoon-young kidnap case with the help of "+signal.get(signal.indexOf("Lee Jae-han")));

System.out.println(signal.get(signal.indexOf("Park Hae-young"))+" goes into a team made to resolve unresolved cases.");

System.out.println(signal.get(3)+" dies while trying to tell Park Hae-young something about the Inju incident.");
signal.remove("Ahn Chi-soo");


signal.add("Lee Jae-han");
signal.contains("Lee Jae-han");
System.out.println("The past changes, and "+signal.get(signal.indexOf("Lee Jae-han"))+ " isn't shoot.");

signal.indexOf("Lee Jae-han");
System.out.println("It turns out that "+signal.get(signal.indexOf("Lee Jae-han")) +" had been secretly staying inside a hospital for years.");
System.out.println(signal.get(0)+" and "+signal.get(1)+" goes to meet "+ signal.get(signal.indexOf("Lee Jae-han")));
}
}