package ibm.quiz.demoQuiz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibm.quiz.demoQuiz.entities.Questions;
import ibm.quiz.demoQuiz.entities.Quiz;
import ibm.quiz.demoQuiz.repo.QuizRepository;

@Service
public class QuizService {

   @Autowired
   QuizRepository quizRepository;
   
   public List<Quiz> fetchAllQuiz(){
		System.out.println(quizRepository.findAll());
		
		return quizRepository.findAll();
		
	}
   
   public void addQuiz(Quiz quiz) {
		
		try {
			quizRepository.save(quiz);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
   public List<Quiz> findAllQuiz() {
		List<Quiz> quizzes =  quizRepository.findAll();

		return quizzes;
	}
	public Quiz findQuizByName(String name) {
		return quizRepository.findByName(name);
	}
   
}
