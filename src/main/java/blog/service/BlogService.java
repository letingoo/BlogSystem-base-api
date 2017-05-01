package blog.service;

import blog.entity.Blog;
import util.PageParam;

import java.util.List;

/**
 * Created by BASA on 2017/4/27.
 */
public interface BlogService {


    void addBlog(Blog blog);

    String deleteBlog(int blogId, String deleter);

    List<Blog> getBlogs(PageParam pageParam);

    List<Blog> getBlogsByUser(PageParam pageParam, String userName);

    Blog getBlogDetail(int blogId);


    String likeBlog(int blogId);

}
