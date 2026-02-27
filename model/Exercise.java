package model;

import java.time.LocalDate;

public class Exercise {

    private int id;
    private int userId;
    private String exerciseName;
    private int duration;
    private int caloriesBurned;

    private String youtubeLink;
    private String videoPath;
    private String thumbnail;

    private LocalDate date;

    public Exercise() {}

    public Exercise(int id, int userId, String exerciseName,
                    int duration, int caloriesBurned,
                    String youtubeLink, String videoPath,
                    String thumbnail, LocalDate date) {

        this.id = id;
        this.userId = userId;
        this.exerciseName = exerciseName;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
        this.youtubeLink = youtubeLink;
        this.videoPath = videoPath;
        this.thumbnail = thumbnail;
        this.date = date;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getExerciseName() { return exerciseName; }
    public void setExerciseName(String exerciseName) { this.exerciseName = exerciseName; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public int getCaloriesBurned() { return caloriesBurned; }
    public void setCaloriesBurned(int caloriesBurned) { this.caloriesBurned = caloriesBurned; }

    public String getYoutubeLink() { return youtubeLink; }
    public void setYoutubeLink(String youtubeLink) { this.youtubeLink = youtubeLink; }

    public String getVideoPath() { return videoPath; }
    public void setVideoPath(String videoPath) { this.videoPath = videoPath; }

    public String getThumbnail() { return thumbnail; }
    public void setThumbnail(String thumbnail) { this.thumbnail = thumbnail; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}