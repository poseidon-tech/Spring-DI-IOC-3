package spring.core_container_3;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vechile {

	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("4 wheels");
	}

	public void transportationType() {
		// TODO Auto-generated method stub
		System.out.println("Road Transport");
	}

	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Car");
	}

}
