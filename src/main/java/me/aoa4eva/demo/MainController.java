package me.aoa4eva.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import me.aoa4eva.demo.models.Message;
import me.aoa4eva.demo.models.Person;
import me.aoa4eva.demo.repositories.MessageRepository;
import me.aoa4eva.demo.repositories.PersonRepository;

@Controller
public class MainController {
		@Autowired 
		MessageRepository msgRepo; 
		
		@Autowired 
		PersonRepository pR; 
	
		@GetMapping("/")
		public String start()
		{
			return "/addmessage";
		}
		
		@GetMapping("/addmessage")
		public @ResponseBody String TestMessage()
		{
			Person p = pR.findOne((long) 1);	
			Message m = new Message(); 
			m.setMessage("Second wonderful message");
			msgRepo.save(m);
			p.addMessage(m);
			pR.save(p);

			return "Message added";
		}
		
		@GetMapping("/addPerson")
		/*DO THIS FIRST TO MAKE SURE YOU HAVE A PERSON IN THE DATABASE...or create your own form to create people*/
		public @ResponseBody String addPerson()
		{
			Person p = new Person();
			p.setFirstName("Kweku");
			p.setLastName("Ananse");
			pR.save(p);
			
			return "Person added";
		}
}
