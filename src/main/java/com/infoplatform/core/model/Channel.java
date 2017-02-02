/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.infoplatform.core.model;

/**
 * 
 * @author MaxKun
 * @version $Id: Channel.java, v 0.1 2016年6月8日 下午4:25:51 MaxKun Exp $
 */
public class Channel {

    private int    id;

    private String pic;

    private String name;

    /**
     * Getter method for property <tt>id</tt>.
     * 
     * @return property value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     * 
     * @param id value to be assigned to property id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>pic</tt>.
     * 
     * @return property value of pic
     */
    public String getPic() {
        return pic;
    }

    /**
     * Setter method for property <tt>pic</tt>.
     * 
     * @param pic value to be assigned to property pic
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * Getter method for property <tt>name</tt>.
     * 
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     * 
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

}
