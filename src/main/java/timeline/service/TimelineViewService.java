package timeline.service;

import blog.entity.Blog;

import java.util.List;

/**
 * Created by BASA on 2017/5/14.
 */

public interface TimelineViewService {


    List<Blog> getTimeline(String userName, int pageno);
}
