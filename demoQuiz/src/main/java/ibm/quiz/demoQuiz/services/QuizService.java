package ibm.quiz.demoQuiz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibm.quiz.demoQuiz.entities.Questions;
import ibm.quiz.demoQuiz.entities.Quiz;
import ibm.quiz.demoQuiz.repo.OptionsRepository;
import ibm.quiz.demoQuiz.repo.QuestionRepository;
import ibm.quiz.demoQuiz.repo.QuizRepository;


@Service
public class QuizService {

	@Autowired
	QuestionRepository questionRepository;
	
	@Autowired
	OptionsRepository choiceRepository;
	
	@Autowired
	QuizRepository quizRepository;

	public Questions addQuestions(Questions question) {
		return questionRepository.save(question);
		
	}

	public List<Questions> findAllQuestion() {
		List<Questions> questions =  questionRepository.findAll();
		System.out.println(questions);
		return questions;
	}
	
	public Quiz addQuiz(Quiz quiz) {
		return quizRepository.save(quiz);
		
	}

	public List<Quiz> findAllQuiz() {
		List<Quiz> quizzes =  quizRepository.findAll();
		System.out.println(quizzes);
		return quizzes;
	}

	public Quiz findQuizByName(String name) {
		return quizRepository.findByName(name);
	}
}