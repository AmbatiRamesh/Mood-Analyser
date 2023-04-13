package com.bridgelabz.moodAnalyser;

public class MoodAnalyser {
    private String message;
    public MoodAnalyser() {
        this.message = message;
    }
    public String moodAnalyser(String message) {
        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}
