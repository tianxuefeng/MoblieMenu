package com.aptsys.android.data.service.base;

import com.rockeagle.framework.tools.REHttpUtility;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;

import java.io.IOException;
import java.util.List;

public class BaseService {

    /**
     * 以POST方式和服务端进行交互
     *
     * @param url
     * @param postData
     * @param encoding
     * @return
     */
    protected String postData(String url, List<NameValuePair> postData, String encoding) {
        String result = "404";
        try {
            result = REHttpUtility.httpPostString(url, null, postData, encoding, encoding);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
