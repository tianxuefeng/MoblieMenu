package com.aptsys.android.ui.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.aptsys.android.R;
import com.aptsys.android.data.Constant.ConstantURL;
import com.aptsys.android.data.entity.Category;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.SimpleImageLoadingListener;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CategoryAdapter extends BaseAdapter {

    protected ImageLoader imageLoader;// = ImageLoader.getInstance();
    private LayoutInflater inflater;
    //	private AsyncImageLoader imageLoader;
    private List<Category> list;
    private DisplayImageOptions options;

    private Tag tag;
    private AnimateFirstDisplayListener firstDisplayListener = new AnimateFirstDisplayListener();

    public CategoryAdapter(Context context, List<Category> list) {
        inflater = LayoutInflater.from(context);
//		imageLoader = new AsyncImageLoader();
        imageLoader = ImageLoader.getInstance();
        options = new DisplayImageOptions.Builder()
                .showStubImage(R.drawable.image_no_bg_small)            // 设置图片下载期间显示的图片
                .showImageForEmptyUri(R.drawable.image_no_bg_small)    // 设置图片Uri为空或是错误的时候显示的图片
                .showImageOnFail(R.drawable.image_no_bg_small)        // 设置图片加载或解码过程中发生错误显示的图片
                .cacheInMemory(true)                        // 设置下载的图片是否缓存在内存中
                .cacheOnDisc(true)                            // 设置下载的图片是否缓存在SD卡中
//		.displayer(new RoundedBitmapDisplayer(20))	// 设置成圆角图片
                .build();                                    // 创建配置过得DisplayImageOption对象
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int arg0) {
        return list.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        return arg0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup arg2) {
        if (convertView == null) {
            tag = new Tag();
            convertView = inflater.inflate(R.layout.item_category, null);
            tag.labName = (TextView) convertView.findViewById(R.id.itemCategoryName);
            tag.imgIcon = (ImageView) convertView.findViewById(R.id.itemCategoryIcon);

            convertView.setTag(tag);
        } else {
            tag = (Tag) convertView.getTag();
        }
        Category entity = list.get(position);
        String iconUrl = null;
        if (entity != null) {
            iconUrl = entity.getIconPhoto();
            if (iconUrl != null && !iconUrl.equals("")) {
                iconUrl = ConstantURL.getImageUrl(iconUrl);
            }
            tag.labName.setText(entity.toString());
        }

        /**
         * 显示图片
         * 参数1：图片url
         * 参数2：显示图片的控件
         * 参数3：显示图片的设置
         * 参数4：监听器
         */
        imageLoader.displayImage(iconUrl, tag.imgIcon, options, firstDisplayListener);

//		// 异步加载图片
//		final View tempview = convertView;
//		if(iconUrl != null && !iconUrl.equals("")){
//			tag.imgIcon.setTag(iconUrl);
//			Bitmap bitmap = null;
//			String imgUrl = iconUrl;
//			if(imgUrl != null){
//				// 延迟加载图片
//				bitmap = imageLoader.loadData(iconUrl, new AsyncImageLoader.LoadDataCallback<Bitmap>() {
//					@Override
//					public void dataLoaded(String arg0, Bitmap arg1) {
//						tag.imgIcon.setImageBitmap(arg1);
//						ImageView imageViewByTag = (ImageView) tempview
//						.findViewWithTag(arg0);
//						if (imageViewByTag != null && arg1!=null) {
//							imageViewByTag.setImageBitmap(arg1);
//						}
//
//					}
//				});
//			}
//			if(bitmap == null){
//				tag.imgIcon.setImageResource(R.drawable.ic_launcher);
//			}else{
//				tag.imgIcon.setImageBitmap(bitmap);
//			}
//		}else{
//			tag.imgIcon.setImageResource(R.drawable.ic_launcher);
//		}
        return convertView;
    }

    /**
     * 图片加载第一次显示监听器
     *
     * @author Administrator
     */
    private static class AnimateFirstDisplayListener extends SimpleImageLoadingListener {

        static final List<String> displayedImages = Collections.synchronizedList(new LinkedList<String>());

        @Override
        public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
            if (loadedImage != null) {
                ImageView imageView = (ImageView) view;
                // 是否第一次显示
                boolean firstDisplay = !displayedImages.contains(imageUri);
                if (firstDisplay) {
                    // 图片淡入效果
                    FadeInBitmapDisplayer.animate(imageView, 500);
                    displayedImages.add(imageUri);
                }
            }
        }
    }

    private class Tag {
        public TextView labName;
        public ImageView imgIcon;
    }
}
