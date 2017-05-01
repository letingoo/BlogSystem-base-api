package comment.service;

import comment.entity.Comment;

import java.util.List;

/**
 * Created by BASA on 2017/4/27.
 */
public interface CommentService {

    List<Comment> getComments(int blogId);

    void addComment(Comment comment);


}
