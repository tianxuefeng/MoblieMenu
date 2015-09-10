package com.aptsys.android.data.service;

import com.aptsys.android.data.Constant.*;
import com.aptsys.android.data.entity.Category;
import com.aptsys.android.data.service.base.BaseService;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class CategoryService extends BaseService {

    /**
     * 分类信息管理Server URL
     **/
    public static final String CATEGORY_URL = ConstantURL.URL_SERVER + "Srvs/categorysrv.asmx/";
//	/** 新增分类 **/
//	public static final String Method_Insert = "InsertCategory";
//	/** 编辑分类 **/
//	public static final String Method_Update = "UpdateCategory";
//	/** 删除分类 **/
//	public static final String Method_Delete = "DeleteCategory";
    /**
     * 获得分类信息
     **/
    public static final String Method_CategoryList = "getCategoryList";

    /**
     * 指定父级分类来获得分类信息
     *
     * @param parentId
     * @return
     */
    public List<Category> getList(String parentId, String language) {
        List<Category> list = null;

        List<NameValuePair> postData = new ArrayList<NameValuePair>();
        postData.add(new BasicNameValuePair("", parentId));
        String dataStr = postData(CATEGORY_URL + Method_CategoryList, postData, "utf-8");
        if (dataStr != null && !dataStr.equals("")) {
            JSONArray jsonArray;
            try {
                jsonArray = new JSONArray(dataStr);
                if (jsonArray != null) {
                    list = new ArrayList<Category>();
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        Category entity = new Category(jsonObject);
                        list.add(entity);
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

//	/**
//	 * 新增分类
//	 * @param entity
//	 * @return
//	 */
//	public int insert(Category entity) {
//		List<NameValuePair> postData = new ArrayList<NameValuePair>();
//		postData.add(new BasicNameValuePair(Category.FIELD_PARENT_ID, entity.getParentId()+""));
//		postData.add(new BasicNameValuePair(Category.FIELD_TITLE, entity.getTitle()+""));
//		postData.add(new BasicNameValuePair(Category.FIELD_DESC, entity.getDesc()+""));
//		postData.add(new BasicNameValuePair(Category.FIELD_IMAGES, entity.getImages()+""));
//		postData.add(new BasicNameValuePair(Category.FIELD_SEQUENCE, entity.getSequence()+""));
//		postData.add(new BasicNameValuePair(Category.FIELD_CREATE_USER, entity.getCreateUser()+""));
//		postData.add(new BasicNameValuePair(Category.FIELD_COUNTRY_CODE, entity.getCountryCode()+""));
//
//		String result = postData(CATEGORY_URL+Method_Insert, postData, "utf-8");
//		result = result.replaceAll("\"", "");
//		if(result.startsWith("true")) {
//			return 1;
//		}
//		return 0;
//	}

    /**
     * 编辑分类
     * @param entity
     * @return
     */
//	public int update(Category entity) {
//		List<NameValuePair> postData = new ArrayList<NameValuePair>();
//		postData.add(new BasicNameValuePair(Category.FIELD_ID, entity.getId()+""));
//		postData.add(new BasicNameValuePair(Category.FIELD_PARENT_ID, entity.getParentId()+""));
//		postData.add(new BasicNameValuePair(Category.FIELD_TITLE, entity.getTitle()+""));
//		postData.add(new BasicNameValuePair(Category.FIELD_DESC, entity.getDesc()+""));
//		postData.add(new BasicNameValuePair(Category.FIELD_IMAGES, entity.getImages()+""));
//		postData.add(new BasicNameValuePair(Category.FIELD_SEQUENCE, entity.getSequence()+""));
//		postData.add(new BasicNameValuePair(Category.FIELD_UPDATE_USER, entity.getUpdateUser()+""));
//		postData.add(new BasicNameValuePair(Category.FIELD_COUNTRY_CODE, entity.getCountryCode()+""));
//
//		String result = postData(CATEGORY_URL+Method_Update, postData, "utf-8");
//		result = result.replaceAll("\"", "");
//		if(result.startsWith("true")) {
//			return 1;
//		}
//		return 0;
//	}

    /**
     * 删除分类
     * @param entity
     * @return
     */
//	public int delete(String id) {
//		List<NameValuePair> postData = new ArrayList<NameValuePair>();
//		postData.add(new BasicNameValuePair(Category.FIELD_ID, id));
//
//		String result = postData(CATEGORY_URL+Method_Delete, postData, "utf-8");
//		result = result.replaceAll("\"", "");
//		if(result.startsWith("true")) {
//			return 1;
//		}
//		return 0;
//	}
}
