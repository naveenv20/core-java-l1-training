package package_base;

public class TypeCastDemo_Assignment17 {

	public static void main(String[] args) {
Parent[] arrParent;
Child[] arrChild;

arrParent=new Parent[10];
arrChild=new Child[20];
System.out.println("Type of arrParent object before assignment  is :"+arrParent.getClass().toString());
arrParent=arrChild;//1
//working fine--parent type object object is referrencing the child object type array
arrChild= (Child[]) arrParent; //2 
System.out.println("Type of arrParent object after assignment is :"+arrParent.getClass().toString());
//type casting parant type object array to child type and assigning that to arrchild. 
arrParent=new Parent[10];
//arrChild= (Child[]) arrParent; //3
//getting exception here as we are directly trying to cast the parent[] to child [], in  the previos case we have assigned the child[] object first and then did a cast
System.out.println("Hello");
	}

}
