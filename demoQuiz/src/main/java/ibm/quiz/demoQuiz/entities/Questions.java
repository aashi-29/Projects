package ibm.quiz.demoQuiz.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
//@NamedQuery(name="selectEmployeeByName", query="select e from Employee e where e.name=:fname")
public class Questions {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	int id;
	@Column(name="Question_NAME")
	String name;
	public int questionTypeId;
	
	@OneToMany(targetEntity=Options.class, cascade=CascadeType.ALL)
	@JoinColumn(name="Question_id",referencedColumnName="id")
	List<Options> option;

	public Questions() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuestionTypeId() {
		return questionTypeId;
	}

	public void setQuestionTypeId(int questionTypeId) {
		this.questionTypeId = questionTypeId;
	}

	public List<Options> getOption() {
		return option;
	}

	public void setOption(List<Options> option) {
		this.option = option;
	}

	public Questions(int id, String name, int questionTypeId, List<Options> option) {
		super();
		this.id = id;
		this.name = name;
		this.questionTypeId = questionTypeId;
		this.option = option;
	
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", QuestionTypeId=" + questionTypeId + ", option=" + option
				+ "]";
	}
	
	
	


}

