package com.aptsys.android.data.entity;

import org.json.JSONObject;

import java.util.Date;

/**
 * Created by tianxuefeng on 10/9/15.
 */
public class Item {

    public static final String ID = "ID";
    public static final String NAME = "Name";
    public static final String NAME2 = "Name2";
    public static final String SHORTNAME = "ShortName";
    public static final String POSNAME = "PosName";
    public static final String KITCHENNAME = "KitchenName";
    public static final String DESCRIPTION = "Description";
    public static final String THUMBNAIL = "Thumbnail";
    public static final String PHOTO = "Photo";
    public static final String DELIND = "DelInd";
    public static final String VALID = "Valid";
    public static final String CREATEDDATE = "CreatedDate";
    public static final String UPDATEDDATE = "UpdatedDate";
    public static final String PUBLISHTIME = "PublishTime";
    public static final String CATEGORYID = "CategoryID";
    public static final String ACTIONBY = "ActionBy";
    public static final String KITCHENID = "KitchenID";
    public static final String FEATURED = "Featured";
    public static final String FEATURED2 = "Featured2";
    public static final String FEATURED3 = "Featured3";
    public static final String FEATURED4 = "Featured4";
    public static final String FEATURED5 = "Featured5";
    public static final String FEATURED6 = "Featured6";
    public static final String UNIT = "Unit";
    public static final String ISLABEL = "isLabel";
    public static final String SEQUENCE = "Sequence";
    public static final String DELETED_TIMESTAMP = "Deleted_TimeStamp";
    public static final String ISSETMEAL = "isSetMeal";
    public static final String SHOWDESCRIPTION = "showDescription";
    public static final String SHORTDESCRIPTION = "ShortDescription";
    public static final String CREATE_TIMESTAMP = "create_timestamp";
    public static final String UPDATE_TIMESTAMP = "update_timestamp";
    public static final String DELETE_TIMESTAMP = "delete_timestamp";

    private Integer iD;
    private String name;
    private String name2;
    private String shortName;
    private String posName;
    private String kitchenName;
    private String description;
    private String thumbnail;
    private String photo;
    private boolean delInd;
    private boolean valid;
    private Date createdDate;
    private Date updatedDate;
    private Date publishTime;
    private Integer categoryID;
    private String actionBy;
    private Integer kitchenID;
    private boolean featured;
    private boolean featured2;
    private boolean featured3;
    private boolean featured4;
    private boolean featured5;
    private boolean featured6;
    private String unit;
    private boolean isLabel;
    private Integer sequence;
    private Date deleted_TimeStamp;
    private boolean isSetMeal;
    private boolean showDescription;
    private String shortDescription;
    private Date create_timestamp;
    private Date update_timestamp;
    private Date delete_timestamp;

    public Item() {
    }

    public Item(Integer iD,
                String name,
                String name2,
                String shortName,
                String posName,
                String kitchenName,
                String description,
                String thumbnail,
                String photo,
                boolean delInd,
                boolean valid,
                Date createdDate,
                Date updatedDate,
                Date publishTime,
                Integer categoryID,
                String actionBy,
                Integer kitchenID,
                boolean featured,
                boolean featured2,
                boolean featured3,
                boolean featured4,
                boolean featured5,
                boolean featured6,
                String unit,
                boolean isLabel,
                Integer sequence,
                Date deleted_TimeStamp,
                boolean isSetMeal,
                boolean showDescription,
                String shortDescription,
                Date create_timestamp,
                Date update_timestamp,
                Date delete_timestamp) {
        super();
        this.iD = iD;
        this.name = name;
        this.name2 = name2;
        this.shortName = shortName;
        this.posName = posName;
        this.kitchenName = kitchenName;
        this.description = description;
        this.thumbnail = thumbnail;
        this.photo = photo;
        this.delInd = delInd;
        this.valid = valid;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.publishTime = publishTime;
        this.categoryID = categoryID;
        this.actionBy = actionBy;
        this.kitchenID = kitchenID;
        this.featured = featured;
        this.featured2 = featured2;
        this.featured3 = featured3;
        this.featured4 = featured4;
        this.featured5 = featured5;
        this.featured6 = featured6;
        this.unit = unit;
        this.isLabel = isLabel;
        this.sequence = sequence;
        this.deleted_TimeStamp = deleted_TimeStamp;
        this.isSetMeal = isSetMeal;
        this.showDescription = showDescription;
        this.shortDescription = shortDescription;
        this.create_timestamp = create_timestamp;
        this.update_timestamp = update_timestamp;
        this.delete_timestamp = delete_timestamp;
    }

    public Item(Item entity) {

        this.iD = entity.iD;
        this.name = entity.name;
        this.name2 = entity.name2;
        this.shortName = entity.shortName;
        this.posName = entity.posName;
        this.kitchenName = entity.kitchenName;
        this.description = entity.description;
        this.thumbnail = entity.thumbnail;
        this.photo = entity.photo;
        this.delInd = entity.delInd;
        this.valid = entity.valid;
        this.createdDate = entity.createdDate;
        this.updatedDate = entity.updatedDate;
        this.publishTime = entity.publishTime;
        this.categoryID = entity.categoryID;
        this.actionBy = entity.actionBy;
        this.kitchenID = entity.kitchenID;
        this.featured = entity.featured;
        this.featured2 = entity.featured2;
        this.featured3 = entity.featured3;
        this.featured4 = entity.featured4;
        this.featured5 = entity.featured5;
        this.featured6 = entity.featured6;
        this.unit = entity.unit;
        this.isLabel = entity.isLabel;
        this.sequence = entity.sequence;
        this.deleted_TimeStamp = entity.deleted_TimeStamp;
        this.isSetMeal = entity.isSetMeal;
        this.showDescription = entity.showDescription;
        this.shortDescription = entity.shortDescription;
        this.create_timestamp = entity.create_timestamp;
        this.update_timestamp = entity.update_timestamp;
        this.delete_timestamp = entity.delete_timestamp;
    }

    public Item(JSONObject jsonObject) {
        try {
            iD = jsonObject.getInt(ID);
            name = jsonObject.getString(NAME);
            name2 = jsonObject.getString(NAME2);
            shortName = jsonObject.getString(SHORTNAME);
            posName = jsonObject.getString(POSNAME);
            kitchenName = jsonObject.getString(KITCHENNAME);
            description = jsonObject.getString(DESCRIPTION);
            thumbnail = jsonObject.getString(THUMBNAIL);
            photo = jsonObject.getString(PHOTO);
            delInd = jsonObject.getBoolean(DELIND);
            valid = jsonObject.getBoolean(VALID);
            categoryID = jsonObject.getInt(CATEGORYID);
            actionBy = jsonObject.getString(ACTIONBY);
            kitchenID = jsonObject.getInt(KITCHENID);
            featured = jsonObject.getBoolean(FEATURED);
            featured2 = jsonObject.getBoolean(FEATURED2);
            featured3 = jsonObject.getBoolean(FEATURED3);
            featured4 = jsonObject.getBoolean(FEATURED4);
            featured5 = jsonObject.getBoolean(FEATURED5);
            featured6 = jsonObject.getBoolean(FEATURED6);
            unit = jsonObject.getString(UNIT);
            isLabel = jsonObject.getBoolean(ISLABEL);
            sequence = jsonObject.getInt(SEQUENCE);
            isSetMeal = jsonObject.getBoolean(ISSETMEAL);
            showDescription = jsonObject.getBoolean(SHOWDESCRIPTION);
            shortDescription = jsonObject.getString(SHORTDESCRIPTION);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Integer getID() {
        return iD;
    }

    public void setID(Integer iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public String getKitchenName() {
        return kitchenName;
    }

    public void setKitchenName(String kitchenName) {
        this.kitchenName = kitchenName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean getDelInd() {
        return delInd;
    }

    public void setDelInd(boolean delInd) {
        this.delInd = delInd;
    }

    public boolean getValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public String getActionBy() {
        return actionBy;
    }

    public void setActionBy(String actionBy) {
        this.actionBy = actionBy;
    }

    public Integer getKitchenID() {
        return kitchenID;
    }

    public void setKitchenID(Integer kitchenID) {
        this.kitchenID = kitchenID;
    }

    public boolean getFeatured() {
        return featured;
    }

    public void setFeatured(boolean featured) {
        this.featured = featured;
    }

    public boolean getFeatured2() {
        return featured2;
    }

    public void setFeatured2(boolean featured2) {
        this.featured2 = featured2;
    }

    public boolean getFeatured3() {
        return featured3;
    }

    public void setFeatured3(boolean featured3) {
        this.featured3 = featured3;
    }

    public boolean getFeatured4() {
        return featured4;
    }

    public void setFeatured4(boolean featured4) {
        this.featured4 = featured4;
    }

    public boolean getFeatured5() {
        return featured5;
    }

    public void setFeatured5(boolean featured5) {
        this.featured5 = featured5;
    }

    public boolean getFeatured6() {
        return featured6;
    }

    public void setFeatured6(boolean featured6) {
        this.featured6 = featured6;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public boolean getisLabel() {
        return isLabel;
    }

    public void setisLabel(boolean isLabel) {
        this.isLabel = isLabel;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Date getDeleted_TimeStamp() {
        return deleted_TimeStamp;
    }

    public void setDeleted_TimeStamp(Date deleted_TimeStamp) {
        this.deleted_TimeStamp = deleted_TimeStamp;
    }

    public boolean getisSetMeal() {
        return isSetMeal;
    }

    public void setisSetMeal(boolean isSetMeal) {
        this.isSetMeal = isSetMeal;
    }

    public boolean getshowDescription() {
        return showDescription;
    }

    public void setshowDescription(boolean showDescription) {
        this.showDescription = showDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Date getcreate_timestamp() {
        return create_timestamp;
    }

    public void setcreate_timestamp(Date create_timestamp) {
        this.create_timestamp = create_timestamp;
    }

    public Date getupdate_timestamp() {
        return update_timestamp;
    }

    public void setupdate_timestamp(Date update_timestamp) {
        this.update_timestamp = update_timestamp;
    }

    public Date getdelete_timestamp() {
        return delete_timestamp;
    }

    public void setdelete_timestamp(Date delete_timestamp) {
        this.delete_timestamp = delete_timestamp;
    }
}
