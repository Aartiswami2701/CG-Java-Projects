package com.cg.practise;
////assignment no.2
public class employeeRecDispl {
	public static void main(String []args) {
		useEmpRecDispl[] e=new useEmpRecDispl[3];
		e[0]=new useEmpRecDispl(1,"aarti",90.896);
		e[1]=new useEmpRecDispl(2,"adi",87.896);
		e[2]=new useEmpRecDispl(3,"abhi",20.896);
		for(useEmpRecDispl e1:e) {
			
			e1.display();
		}
	}

}

