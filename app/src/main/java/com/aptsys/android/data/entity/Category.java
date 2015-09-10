package com.aptsys.android.data.entity;

import android.os.Bundle;

import org.json.JSONObject;

import java.io.Serializable;
import java.util.Date;

public class Category implements Serializable {

    // Tian Xuefeng, 2015-09-09
    public static final String ID = "ID";
    public static final String NAME = "Name";
    public static final String ALTERNATENAME = "AlternateName";
    public static final String PHOTO = "Photo";
    public static final String DISPLAYPHOTO = "DisplayPhoto";
    public static final String THUMBNAIL = "Thumbnail";
    public static final String ICONPHOTO = "IconPhoto";
    public static final String VALID = "Valid";
    public static final String CREATEDDATE = "CreatedDate";
    public static final String UPDATEDDATE = "UpdatedDate";
    public static final String DELIND = "DelInd";
    public static final String ACTIONBY = "ActionBy";
    public static final String PARENTID = "ParentID";
    public static final String GROUPID = "GroupID";
    public static final String SEQUENCE = "Sequence";
    public static final String PRESETDISCOUNTID = "PresetDiscountID";
    public static final String DISCOUNTSCHEMAID = "DiscountSchemaID";
    public static final String ITEMAVALIABLESCHEMAID = "ItemAvaliableSchemaID";
    public static final String DISPLAYSIDEPHOTO = "DisplaySidePhoto";
    public static final String NUMBEROFCOLUMNS = "NumberOfColumns";
    public static final String ISSETMEAL = "isSetMeal";
    public static final String TYPE = "Type";
    public static final String ISWEBVIEW = "isWebView";
    public static final String URL = "URL";
    public static final String MAXNOOFORDER = "MaxNoOfOrder";
    public static final String SHOWINPRODUCTS = "ShowInProducts";
    public static final String CREATE_TIMESTAMP = "create_timestamp";
    public static final String UPDATE_TIMESTAMP = "update_timestamp";
    public static final String DELETE_TIMESTAMP = "delete_timestamp";
    public static final String QUICKKEY = "QuickKey";
    public static final String CATEGORYICONPHOTO = "CategoryIconPhoto";
    public static final String POS = "POS";
    public static final String ISONLYFORMEMBERSHIP = "isOnlyForMembership";
    public static final String ISFEEDBACK = "isFeedback";

    private Integer iD;
    private String name;
    private String alternateName;
    private String photo;
    private boolean displayPhoto;
    private String thumbnail;
    private String iconPhoto;
    private boolean valid;
    private Date createdDate;
    private Date updatedDate;
    private boolean delInd;
    private String actionBy;
    private Integer parentID;
    private Integer groupID;
    private Integer sequence;
    private Integer presetDiscountID;
    private Integer discountSchemaID;
    private String itemAvaliableSchemaID;
    private boolean displaySidePhoto;
    private Integer numberOfColumns;
    private boolean isSetMeal;
    private boolean type;
    private boolean isWebView;
    private String uRL;
    private boolean maxNoOfOrder;
    private String showInProducts;
    private Date create_timestamp;
    private Date update_timestamp;
    private Date delete_timestamp;
    private String quickKey;
    private String categoryIconPhoto;
    private boolean pOS;
    private boolean isOnlyForMembership;
    private boolean isFeedback;

    public Category() {
    }

    public Category(String name) {
        super();
        this.name = name;
    }

    public Category(Integer iD, String name, String alternateName, String photo, boolean displayPhoto, String thumbnail,
                    String iconPhoto, boolean valid, Date createdDate, Date updatedDate, boolean delInd, String actionBy,
                    Integer parentID, Integer groupID, Integer sequence, Integer presetDiscountID, Integer discountSchemaID,
                    String itemAvaliableSchemaID, boolean displaySidePhoto, Integer numberOfColumns, boolean isSetMeal, boolean type,
                    boolean isWebView, String uRL, boolean maxNoOfOrder, String showInProducts, Date create_timestamp,
                    Date update_timestamp, Date delete_timestamp, String quickKey, String categoryIconPhoto, boolean pOS,
                    boolean isOnlyForMembership, boolean isFeedback) {
        super();
        this.iD = iD;
        this.name = name;
        this.alternateName = alternateName;
        this.photo = photo;
        this.displayPhoto = displayPhoto;
        this.thumbnail = thumbnail;
        this.iconPhoto = iconPhoto;
        this.valid = valid;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.delInd = delInd;
        this.actionBy = actionBy;
        this.parentID = parentID;
        this.groupID = groupID;
        this.sequence = sequence;
        this.presetDiscountID = presetDiscountID;
        this.discountSchemaID = discountSchemaID;
        this.itemAvaliableSchemaID = itemAvaliableSchemaID;
        this.displaySidePhoto = displaySidePhoto;
        this.numberOfColumns = numberOfColumns;
        this.isSetMeal = isSetMeal;
        this.type = type;
        this.isWebView = isWebView;
        this.uRL = uRL;
        this.maxNoOfOrder = maxNoOfOrder;
        this.showInProducts = showInProducts;
        this.create_timestamp = create_timestamp;
        this.update_timestamp = update_timestamp;
        this.delete_timestamp = delete_timestamp;
        this.quickKey = quickKey;
        this.categoryIconPhoto = categoryIconPhoto;
        this.pOS = pOS;
        this.isOnlyForMembership = isOnlyForMembership;
        this.isFeedback = isFeedback;
    }

    public Category(Category entity) {
        this.iD = entity.iD;
        this.name = entity.name;
        this.alternateName = entity.alternateName;
        this.photo = entity.photo;
        this.displayPhoto = entity.displayPhoto;
        this.thumbnail = entity.thumbnail;
        this.iconPhoto = entity.iconPhoto;
        this.valid = entity.valid;
        this.createdDate = entity.createdDate;
        this.updatedDate = entity.updatedDate;
        this.delInd = entity.delInd;
        this.actionBy = entity.actionBy;
        this.parentID = entity.parentID;
        this.groupID = entity.groupID;
        this.sequence = entity.sequence;
        this.presetDiscountID = entity.presetDiscountID;
        this.discountSchemaID = entity.discountSchemaID;
        this.itemAvaliableSchemaID = entity.itemAvaliableSchemaID;
        this.displaySidePhoto = entity.displaySidePhoto;
        this.numberOfColumns = entity.numberOfColumns;
        this.isSetMeal = entity.isSetMeal;
        this.type = entity.type;
        this.isWebView = entity.isWebView;
        this.uRL = entity.uRL;
        this.maxNoOfOrder = entity.maxNoOfOrder;
        this.showInProducts = entity.showInProducts;
        this.create_timestamp = entity.create_timestamp;
        this.update_timestamp = entity.update_timestamp;
        this.delete_timestamp = entity.delete_timestamp;
        this.quickKey = entity.quickKey;
        this.categoryIconPhoto = entity.categoryIconPhoto;
        this.pOS = entity.pOS;
        this.isOnlyForMembership = entity.isOnlyForMembership;
        this.isFeedback = entity.isFeedback;
    }

    public Category(JSONObject jsonObject) {
        try {

            iD = jsonObject.getInt(ID);
            name = jsonObject.getString(NAME);
            alternateName = jsonObject.getString(ALTERNATENAME);
            photo = jsonObject.getString(PHOTO);
            displayPhoto = jsonObject.getBoolean(DISPLAYPHOTO);
            thumbnail = jsonObject.getString(THUMBNAIL);
            iconPhoto = jsonObject.getString(ICONPHOTO);
            valid = jsonObject.getBoolean(VALID);
            //createdDate = jsonObject.getString(CREATEDDATE);
            //updatedDate = jsonObject.getString(UPDATEDDATE);
            delInd = jsonObject.getBoolean(DELIND);
            actionBy = jsonObject.getString(ACTIONBY);
            parentID = jsonObject.getInt(PARENTID);
            groupID = jsonObject.getInt(GROUPID);
            sequence = jsonObject.getInt(SEQUENCE);
            presetDiscountID = jsonObject.getInt(PRESETDISCOUNTID);
            discountSchemaID = jsonObject.getInt(DISCOUNTSCHEMAID);
            itemAvaliableSchemaID = jsonObject.getString(ITEMAVALIABLESCHEMAID);
            displaySidePhoto = jsonObject.getBoolean(DISPLAYSIDEPHOTO);
            numberOfColumns = jsonObject.getInt(NUMBEROFCOLUMNS);
            isSetMeal = jsonObject.getBoolean(ISSETMEAL);
            type = jsonObject.getBoolean(TYPE);
            isWebView = jsonObject.getBoolean(ISWEBVIEW);
            uRL = jsonObject.getString(URL);
            maxNoOfOrder = jsonObject.getBoolean(MAXNOOFORDER);
            showInProducts = jsonObject.getString(SHOWINPRODUCTS);
            //create_timestamp = jsonObject.getString(CREATE_TIMESTAMP);
            //update_timestamp = jsonObject.getString(UPDATE_TIMESTAMP);
            //delete_timestamp = jsonObject.getString(DELETE_TIMESTAMP);
            quickKey = jsonObject.getString(QUICKKEY);
            categoryIconPhoto = jsonObject.getString(CATEGORYICONPHOTO);
            pOS = jsonObject.getBoolean(POS);
            isOnlyForMembership = jsonObject.getBoolean(ISONLYFORMEMBERSHIP);
            isFeedback = jsonObject.getBoolean(ISFEEDBACK);

            String createStr = jsonObject.getString(CREATEDDATE);
            if (createStr != null && !createStr.equals("")) {
                createStr = createStr.replaceAll("/", "").replaceAll("[Date()]", "");
                Long createLong = Long.valueOf(createStr);
                createdDate = new Date(createLong);
            }

            String updateStr = jsonObject.getString(UPDATEDDATE);
            if (updateStr != null && !updateStr.equals("")) {
                updateStr = updateStr.replaceAll("/", "").replaceAll("[Date()]", "");
                Long updateLong = Long.valueOf(updateStr);
                updatedDate = new Date(updateLong);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //	Create from a bundle
    public Category(Bundle b) {
        if (b != null) {
//            this.flowerName = b.getString(FLOWER_NAME);
//            this.imageResource = b.getInt(IMAGE_RESOURCE);
//            this.price = b.getDouble(PRICE);
//            this.instructions = b.getString(INSTRUCTIONS);
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

    public String getAlternateName() {
        return alternateName;
    }

    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean getDisplayPhoto() {
        return displayPhoto;
    }

    public void setDisplayPhoto(boolean displayPhoto) {
        this.displayPhoto = displayPhoto;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getIconPhoto() {
        return iconPhoto;
    }

    public void setIconPhoto(String iconPhoto) {
        this.iconPhoto = iconPhoto;
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

    public boolean getDelInd() {
        return delInd;
    }

    public void setDelInd(boolean delInd) {
        this.delInd = delInd;
    }

    public String getActionBy() {
        return actionBy;
    }

    public void setActionBy(String actionBy) {
        this.actionBy = actionBy;
    }

    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }

    public Integer getGroupID() {
        return groupID;
    }

    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Integer getPresetDiscountID() {
        return presetDiscountID;
    }

    public void setPresetDiscountID(Integer presetDiscountID) {
        this.presetDiscountID = presetDiscountID;
    }

    public Integer getDiscountSchemaID() {
        return discountSchemaID;
    }

    public void setDiscountSchemaID(Integer discountSchemaID) {
        this.discountSchemaID = discountSchemaID;
    }

    public String getItemAvaliableSchemaID() {
        return itemAvaliableSchemaID;
    }

    public void setItemAvaliableSchemaID(String itemAvaliableSchemaID) {
        this.itemAvaliableSchemaID = itemAvaliableSchemaID;
    }

    public boolean getDisplaySidePhoto() {
        return displaySidePhoto;
    }

    public void setDisplaySidePhoto(boolean displaySidePhoto) {
        this.displaySidePhoto = displaySidePhoto;
    }

    public Integer getNumberOfColumns() {
        return numberOfColumns;
    }

    public void setNumberOfColumns(Integer numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }

    public boolean getisSetMeal() {
        return isSetMeal;
    }

    public void setisSetMeal(boolean isSetMeal) {
        this.isSetMeal = isSetMeal;
    }

    public boolean getType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public boolean getisWebView() {
        return isWebView;
    }

    public void setisWebView(boolean isWebView) {
        this.isWebView = isWebView;
    }

    public String getURL() {
        return uRL;
    }

    public void setURL(String uRL) {
        this.uRL = uRL;
    }

    public boolean getMaxNoOfOrder() {
        return maxNoOfOrder;
    }

    public void setMaxNoOfOrder(boolean maxNoOfOrder) {
        this.maxNoOfOrder = maxNoOfOrder;
    }

    public String getShowInProducts() {
        return showInProducts;
    }

    public void setShowInProducts(String showInProducts) {
        this.showInProducts = showInProducts;
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

    public String getQuickKey() {
        return quickKey;
    }

    public void setQuickKey(String quickKey) {
        this.quickKey = quickKey;
    }

    public String getCategoryIconPhoto() {
        return categoryIconPhoto;
    }

    public void setCategoryIconPhoto(String categoryIconPhoto) {
        this.categoryIconPhoto = categoryIconPhoto;
    }

    public boolean getPOS() {
        return pOS;
    }

    public void setPOS(boolean pOS) {
        this.pOS = pOS;
    }

    public boolean getisOnlyForMembership() {
        return isOnlyForMembership;
    }

    public void setisOnlyForMembership(boolean isOnlyForMembership) {
        this.isOnlyForMembership = isOnlyForMembership;
    }

    public boolean getisFeedback() {
        return isFeedback;
    }

    public void setisFeedback(boolean isFeedback) {
        this.isFeedback = isFeedback;
    }

    @Override
    public String toString() {
        return this.name;
    }

    //	Package data for transfer between activities
    public Bundle toBundle() {
        Bundle b = new Bundle();
        b.putString(NAME, this.name);
        b.putString(CATEGORYICONPHOTO, this.categoryIconPhoto);
        b.putBoolean(DISPLAYPHOTO, this.displayPhoto);
        b.putString(photo, this.photo);
        return b;
    }

}
