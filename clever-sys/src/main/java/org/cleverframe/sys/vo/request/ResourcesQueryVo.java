package org.cleverframe.sys.vo.request;

import org.cleverframe.common.vo.request.BaseRequestVo;

/**
 * 作者：LiZW <br/>
 * 创建时间：2016/10/21 18:43 <br/>
 */
public class ResourcesQueryVo extends BaseRequestVo {
    private static final long serialVersionUID = 1L;

    /**
     * 资源标题
     */
    private String title;

    /**
     * 需要授权才允许访问（1：需要；2：不需要）
     */
    private Character needAuthorization;

    /**
     * 资源URL地址
     */
    private String resourcesUrl;

    /**
     * 资源访问所需要的权限标识字符串
     */
    private String permission;

    /**
     * 资源类型（1:Web页面URL地址, 2:后台请求URL地址, 3:Web页面UI资源）
     */
    private String resourcesType;

    /*--------------------------------------------------------------
     *          getter、setter
     * -------------------------------------------------------------*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Character getNeedAuthorization() {
        return needAuthorization;
    }

    public void setNeedAuthorization(Character needAuthorization) {
        this.needAuthorization = needAuthorization;
    }

    public String getResourcesUrl() {
        return resourcesUrl;
    }

    public void setResourcesUrl(String resourcesUrl) {
        this.resourcesUrl = resourcesUrl;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getResourcesType() {
        return resourcesType;
    }

    public void setResourcesType(String resourcesType) {
        this.resourcesType = resourcesType;
    }
}
