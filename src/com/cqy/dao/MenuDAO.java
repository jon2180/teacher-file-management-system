package com.cqy.dao;

import java.util.List;

/**
 * Created by goumin on 2019/10/24.
 */
public interface MenuDAO {
    List getMenu(String roleId, int pageNum, int pageSize);

    boolean checkParentMenuId(String parentMenuId, String roleId);

    boolean editAdminMenuAction(Integer id, String roleId, String roleName, String menuId, String menuName, String menuHref, String menuIcon, String parentMenuId);

    boolean addAdminMenu(String roleId, String roleName, String menuId, String menuName, String menuHref, String menuIcon, String parentMenuId);

    boolean deleteMenuById(Integer id);
}
