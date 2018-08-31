package pmaven.Demo;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXB {

	public static void main(String[] args) throws JAXBException {
		convertJavaObject();

	}

	public static void convertJavaObject() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Employee.class);
		// create unmarsheller
		Unmarshaller un = context.createUnmarshaller();
		// file loc
		File f = new File("C:\\Users\\Prasad\\eclipse-workspace\\Demotask\\Employee.xml");
		Employee e = (Employee) un.unmarshal(f);
		System.out.println("Employee details");
		List<Details> x = e.getDetails();
		for (Details t : x) {
			System.out.println("id:" + t.getId());
			System.out.println("id:" + t.getName());
			System.out.println("id:" + t.getEmail());
			System.out.println("id:" + t.getPhone());
		}

	}

}
