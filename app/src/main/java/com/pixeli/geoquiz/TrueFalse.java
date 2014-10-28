package com.pixeli.geoquiz;


public class TrueFalse {
    private int mQuestion;

    private boolean mTruequestion;

    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTruequestion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;

    }

    public void setQuestion(int question) {
        mQuestion = question;


    }

    public boolean isTrueQuestion() {
        return mTruequestion;

    }

    public void setTruequestion(boolean trueQuestion) {
        mTruequestion = trueQuestion;
    }




    }
