package com.yc.library.api;

import com.yc.library.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ================================================
 * 作    者：杨充
 * 版    本：1.0
 * 创建日期：2017/6/6
 * 描    述：图片接口
 * 修订历史：
 * ================================================
 */
public final class ConstantImageApi {



    private static final Integer[] ides = new Integer[]{
            R.drawable.bg_autumn_tree_min,
            R.drawable.bg_kites_min,
            R.drawable.bg_lake_min,
            R.drawable.bg_leaves_min,
            R.drawable.bg_magnolia_trees_min,
            R.drawable.bg_solda_min,
            R.drawable.bg_tree_min,
            R.drawable.bg_tulip_min
    };
    public static List<Integer> createBgImg() {
        return Arrays.asList(ides);
    }

    private static final Integer[] smallImages = new Integer[]{
            R.drawable.bg_small_autumn_tree_min,
            R.drawable.bg_small_kites_min,
            R.drawable.bg_small_lake_min,
            R.drawable.bg_small_leaves_min,
            R.drawable.bg_small_magnolia_trees_min,
            R.drawable.bg_small_solda_min,
            R.drawable.bg_small_tree_min,
            R.drawable.bg_small_tulip_min
    };
    public static List<Integer> createSmallImage() {
        return Arrays.asList(smallImages);
    }

    /**
     * 注意：
     * 集合类如果仅仅有添加元素的方法，而没有相应的删除机制，导致内存被占用。
     * 如果这个集合类是全局性的变量 (比如类中的静态属性，全局性的 map 等即有静态引用或 final 一直指向它)，
     * 那么没有相应的删除机制，很可能导致集合所占用的内存只增不减。
     * 这里做法：使用arrays文件代替
     */
    public static final int[] NarrowImage = {
            R.drawable.bg_small_autumn_tree_min,
            R.drawable.bg_small_kites_min,
            R.drawable.bg_small_lake_min,
            R.drawable.bg_small_leaves_min,
            R.drawable.bg_small_magnolia_trees_min,
            R.drawable.bg_small_solda_min,
            R.drawable.bg_small_tree_min,
            R.drawable.bg_small_tulip_min
    };

    public static ArrayList<Integer> getNarrowImage(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < NarrowImage.length; i++) {
            arrayList.add(NarrowImage[i]);
        }
        return arrayList;
    }

}
