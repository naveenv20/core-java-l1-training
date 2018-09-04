package package_base;

public class StaticandNonstatic_Assignment6 {
static int iStatic;
char cChoice;
public StaticandNonstatic_Assignment6(char Choice) {
	iStatic++;
	cChoice = Choice;
	
}

static void displayObjectcount() {
	System.out.println("Static element value="+ iStatic);
	
}

void displayUserchoice() {
	System.out.println("User Choice is "+ cChoice);
}

}
