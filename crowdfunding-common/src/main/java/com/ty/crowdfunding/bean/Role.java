package com.ty.crowdfunding.bean;

/**
 * @Description TODO
 * @Author 71042
 * @Date 2019/9/22 12:39
 */
public class Role {
    private Integer id;
    private String roleName;
    private String createDate;

    public Role() {
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
