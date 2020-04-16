package ibm.quiz.demoQuiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibm.quiz.demoQuiz.entities.Questions;
import ibm.quiz.demoQuiz.entities.Quiz;
import ibm.quiz.demoQuiz.services.QuestionService;
import ibm.quiz.demoQuiz.services.QuizService;

@RestController
@RequestMapping(path="/api")
public class QuizController {
	
	@Autowired
	QuizService quizService;
	
	@Autowired
	QuestionService questionService;
	
	@PostMapping("/quiz")
	public ResponseEntity<Void> addQuestion(@RequestBody Quiz quiz){
		ResponseEntity<Void> re= null;
		
		try{
			quizService.addQuiz(quiz);
			re = new ResponseEntity<>(HttpStatus.CREATED);;
		}
		catch(EmptyResultDataAccessException e){
			re = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
		}
		return re;
	}
	
	
	@PostMapping("/question")
	public ResponseEntity<Void> addQuestion(@RequestBody Questions question){
		ResponseEntity<Void> re= null;
		
		try{
			questionService.addQuestion(question);
			re = new ResponseEntity<>(HttpStatus.CREATED);;
			
		}
		catch(EmptyResultDataAccessException e){
			re = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
		}
		
		
		return re;
	}
	
	@GetMapping("/quiz")
	public List<Quiz> findQuiz(){

		List<Quiz> quiz = quizService.fetchAllQuiz();
		return quiz;
	}
	
	@GetMapping("/question")
	public List<Questions> findQues(){

		List<Questions> questionss = questionService.fetchAllQuestions();
		return questionss;
	}
	
	@GetMapping("/quiz/{name}")
	public Quiz findQuizByName(@PathVariable("name") String name){
		return quizService.findQuizByName(name);
	}

}
