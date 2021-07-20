package com.adamwong.dojooverflow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adamwong.dojooverflow.models.Answer;
import com.adamwong.dojooverflow.models.Question;
import com.adamwong.dojooverflow.models.Tag;
import com.adamwong.dojooverflow.repositories.AnswerRepository;
import com.adamwong.dojooverflow.repositories.QuestionRepository;
import com.adamwong.dojooverflow.repositories.TagRepository;
import com.adamwong.productsandcategories.models.Category;
import com.adamwong.productsandcategories.models.Product;

@Service
public class DojooverflowService {
	@Autowired
	private AnswerRepository aRepo;
	@Autowired
	private QuestionRepository qRepo;
	@Autowired
	private TagRepository tRepo;
	
	public Question createQuestion(Question question) {
		return qRepo.save(question);
	}
//	public void createQuestionWTag(Question question) {
//		List<Tag> questionsTags = new ArrayList<Tag>();
//		String subject = question.subject;
//		Tag tag = this.tRepo.findBySubject(subject).orElse(null);
//		if(!questionsTags.contains(tag));
//		questionsTags.add(tag);
//		Question newQuestion = new Question(question.getqText(), questionsTags);
//		this.qRepo.save(newQuestion);
//	}
//
//	public Question addTagtoQuestion(Tag tag, Question question) {
//		List<Tag> tags = question.getTags();
//		tags.add(question);
//		return qRepo.save(tag);
//	}
	public Tag createTag(Tag tag) {
		return tRepo.save(tag);
	}
	public Answer createAnswer(Answer answer) {
		return aRepo.save(answer);
	}
	public List<Question> allQuestions() {
		return qRepo.findAll();
	}
	public List<Answer> allAnswers() {
		return aRepo.findAll();
	}
	public List<Tag> allTags() {
		return tRepo.findAll();
	}
	public Question findQuestion (Long id) {
		return this.qRepo.findById(id).orElse(null);
	}
	public Answer findAnswer (Long id) {
		return this.aRepo.findById(id).orElse(null);
	}
	public Tag findTag (Long id) {
		return this.tRepo.findById(id).orElse(null);
	}
    public void destroyQuestion(Long id) {
        this.qRepo.deleteById(id);
    }
    public void destroyAnswer(Long id) {
        this.aRepo.deleteById(id);
    }
    public void destroyTag(Long id) {
        this.tRepo.deleteById(id);
    }
}

