package ibm.quiz.demoQuiz.repo;

 

import org.springframework.data.jpa.repository.JpaRepository;



import ibm.quiz.demoQuiz.entities.Questions;

public interface QuestionRepository extends JpaRepository<Questions, Integer>{
	
	public Questions findByName(String name);
	public Questions findById(int id);
}