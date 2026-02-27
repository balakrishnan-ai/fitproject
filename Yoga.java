package model;

import java.time.LocalDate;

public class Yoga {

    private int id;
    private int userId;
    private String poseName;
    private int duration;

    private String youtubeLink;
    private String videoPath;
    private String thumbnail;

    private LocalDate date;

    public Yoga() {}

    public Yoga(int id, int userId, String poseName,
                int duration, String youtubeLink,
                String videoPath, String thumbnail,
                LocalDate date) {

        this.id = id;
        this.userId = userId;
        this.poseName = poseName;
        this.duration = duration;
        this.youtubeLink = youtubeLink;
        this.videoPath = videoPath;
        this.thumbnail = thumbnail;
        this.date = date;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getPoseName() { return poseName; }
    public void setPoseName(String poseName) { this.poseName = poseName; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public String getYoutubeLink() { return youtubeLink; }
    public void setYoutubeLink(String youtubeLink) { this.youtubeLink = youtubeLink; }

    public String getVideoPath() { return videoPath; }
    public void setVideoPath(String videoPath) { this.videoPath = videoPath; }

    public String getThumbnail() { return thumbnail; }
    public void setThumbnail(String thumbnail) { this.thumbnail = thumbnail; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}