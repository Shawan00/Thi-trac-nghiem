package com.exam.ptitexam.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "results")
public class ExamResult {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int numberOfCorrectQuestion;
    private double score;

    @ManyToOne
    @JoinColumn(name = "user_Id")
    private User user;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "exam_Id")
    private Exam exam;

    private Timestamp timeDoExam;

    public Timestamp getTimeDoExam() {
        return timeDoExam;
    }

    public void setTimeDoExam(Timestamp timeDoExam) {
        this.timeDoExam = timeDoExam;
    }

    public ExamResult() {
    }

    public ExamResult(int numberOfCorrectQuestion, double score, User user, Exam exam) {
        this.numberOfCorrectQuestion = numberOfCorrectQuestion;
        this.score = score;
        this.user = user;
        this.exam = exam;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumberOfCorrectQuestion() {
        return numberOfCorrectQuestion;
    }

    public void setNumberOfCorrectQuestion(int numberOfCorrectQuestion) {
        this.numberOfCorrectQuestion = numberOfCorrectQuestion;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
