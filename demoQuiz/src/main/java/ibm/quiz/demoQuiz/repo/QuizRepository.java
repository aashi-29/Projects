package ibm.quiz.demoQuiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;




import ibm.quiz.demoQuiz.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer>{
	
	public Quiz findByName(String name);
	public Quiz findById(int id);
}