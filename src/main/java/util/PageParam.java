package util;

import java.io.Serializable;

/**
 * Created by BASA on 2017/4/27.
 * 分页的工具类
 */
public class PageParam implements Serializable{


    /*
     * pageNo从1开始
     */

    private int start, size;

    public PageParam(int pageNo, int pageSize) {

        start = (pageNo - 1) * pageSize;
        size = pageSize;
    }


    public int getStart() {
        return start;
    }


    public int getSize() {
        return size;
    }

}
