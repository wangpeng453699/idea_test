package com.bjsxt.pojo;

import java.io.Serializable;

/**
 * @Author WP
 * @Date 2021/7/10
 * @Description TODO
 * @Version 1.0
 */
public class User implements Serializable {
    private Integer userid;
    private String username;
    private Integer userage;

    public Integer getUserid() {
        return userid;
    }
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Integer getUserage() {
        return userage;
    }
    public void setUserage(Integer userage) {
        this.userage = userage;
    }

}
