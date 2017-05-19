package follow.service;

import java.util.List;

/**
 * Created by BASA on 2017/4/27.
 */
public interface FollowService {

    String followSomeone(String follower, String followee);

    List<String> getFollowee(String follower);


    List<String> getFollower(String leader);
}
