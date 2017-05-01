package blog.entity;

import user.entity.User;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by BASA on 2017/4/27.
 */
public class Blog implements Serializable {



    private int id;

    private String title;

    // 内容，暂时用String类型
    private String content;

    private String userName;

    private User user;

    // 发帖时间
    private Timestamp time;

    // 点赞数
    private int likes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public Timestamp getTime() {
        return time;
    }
}

