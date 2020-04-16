
  
package ibm.quiz.demoQuiz.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import ibm.quiz.demoQuiz.entities.Questions;
import ibm.quiz.demoQuiz.repo.QuestionRepository;



@Service
public class QuestionService {
	
	@Autowired
	QuestionRepository questionRepository;
	
	public List<Questions> fetchAllQuestions(){
		System.out.println(questionRepository.findAll());
		return questionRepository.findAll();
	}

	

	public void addQuestion(Questions question) {
		// TODO Auto-generated method stub
		try {
//			employeeRepository.addEmployee(toAdd);
			questionRepository.save(question);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

//

}
