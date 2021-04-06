package com.controller;

import com.service.UserService;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * TODO: 描述
 *
 * @author htq
 * @classname UserController
 * @date 2021/3/25 9:27
 */
public class UserController {

    Object[] group;
    List list;
    Set set;
    Map map;
    Properties properties;


    String strType;
    Byte byteType;
    Short shortType;
    Integer intType;
    Long longType;
    Float floatType;
    Double doubleType;
    Boolean booleanType;
    Character charType;

    public String getStrType() {
        return strType;
    }

    public void setStrType(String strType) {
        this.strType = strType;
    }

    public Byte getByteType() {
        return byteType;
    }

    public void setByteType(Byte byteType) {
        this.byteType = byteType;
    }

    public Short getShortType() {
        return shortType;
    }

    public void setShortType(Short shortType) {
        this.shortType = shortType;
    }

    public Integer getIntType() {
        return intType;
    }

    public void setIntType(Integer intType) {
        this.intType = intType;
    }

    public Long getLongType() {
        return longType;
    }

    public void setLongType(Long longType) {
        this.longType = longType;
    }

    public Float getFloatType() {
        return floatType;
    }

    public void setFloatType(Float floatType) {
        this.floatType = floatType;
    }

    public Double getDoubleType() {
        return doubleType;
    }

    public void setDoubleType(Double doubleType) {
        this.doubleType = doubleType;
    }

    public Boolean getBooleanType() {
        return booleanType;
    }

    public void setBooleanType(Boolean booleanType) {
        this.booleanType = booleanType;
    }

    public Character getCharType() {
        return charType;
    }

    public void setCharType(Character charType) {
        this.charType = charType;
    }

    public Object[] getGroup() {
        return group;
    }

    public void setGroup(Object[] group) {
        this.group = group;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
