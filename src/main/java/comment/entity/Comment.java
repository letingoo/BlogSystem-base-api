package comment.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by BASA on 2017/4/27.
 */
public class Comment implements Serializable{
    private int id;

    private String content;

    private int blogId;

    private String userName;

    private Timestamp time;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

}
