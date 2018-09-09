package Java.Wipro.TT.CDC7;


import Wipro.TT.ProjectZone.*;

class AccessSpecifiersDemo_A16 extends AccessSpecifiers{

void view(){
//System.out.println(iDefNo);
//Default access modifier so not able to access this outside the package "Wipro.TT.ProjectZone" and this file is from "Java.Wipro.TT.CDC7"
System.out.println(iProNo);
//System.out.println(iPriNo);
//Private access modifier so not able to access this
display();
}

public static void main(String a[]){
AccessSpecifiersDemo_A16 object= new AccessSpecifiersDemo_A16 ();
object.view();
}
}