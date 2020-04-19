package ibm.quiz.demoQuiz.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
public class Questions {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String text;
	@OneToMany(cascade=CascadeType.ALL)
	List<Options> options;
	public Questions(int id, String text, List<Options> options) {
		super();
		this.id = id;
		this.text = text;
		this.options = options;
	}
	public Questions() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String gettext() {
		return text;
	}
	public void settext(String text) {
		this.text = text;
	}
	public List<Options> getChoices() {
		return options;
	}
	public void setChoices(List<Options> options) {
		this.options = options;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", text=" + text + ", choices=" + options + "]";
	}

}