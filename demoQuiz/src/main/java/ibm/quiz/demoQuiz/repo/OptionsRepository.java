package ibm.quiz.demoQuiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ibm.quiz.demoQuiz.entities.Options;

public interface OptionsRepository extends JpaRepository<Options, Integer>{

}
