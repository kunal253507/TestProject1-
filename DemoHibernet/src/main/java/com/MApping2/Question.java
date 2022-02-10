package com.MApping2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	

	@Id
	@Column(name="question_id")
	private int questionid;
	private String question;
	
	
	@OneToOne
	private Answer answer;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int questionid, String question, Answer answer) {
		super();
		this.questionid = questionid;
		this.question = question;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [questionid=" + questionid + ", question=" + question + ", answer=" + answer + "]";
	}

	public int getQuestionid() {
		return questionid;
	}

	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
}
