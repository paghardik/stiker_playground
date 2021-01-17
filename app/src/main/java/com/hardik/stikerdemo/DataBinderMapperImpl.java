package com.hardik.stikerdemo;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.hardik.stikerdemo.databinding.ActivityMainBindingImpl;
import com.hardik.stikerdemo.databinding.FragmentHomeBindingImpl;
import com.hardik.stikerdemo.databinding.FragmentSearchStickerPackBindingImpl;
import com.hardik.stikerdemo.databinding.FragmentStickerPackDetailsBindingImpl;
import com.hardik.stikerdemo.databinding.FragmentStickerPackListBindingImpl;
import com.hardik.stikerdemo.databinding.RecyclerViewItemBindingImpl;
import com.hardik.stikerdemo.databinding.RecyclerViewSubItemBindingImpl;
import com.hardik.stikerdemo.databinding.StickerPacksListItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTHOME = 2;

  private static final int LAYOUT_FRAGMENTSEARCHSTICKERPACK = 3;

  private static final int LAYOUT_FRAGMENTSTICKERPACKDETAILS = 4;

  private static final int LAYOUT_FRAGMENTSTICKERPACKLIST = 5;

  private static final int LAYOUT_RECYCLERVIEWITEM = 6;

  private static final int LAYOUT_RECYCLERVIEWSUBITEM = 7;

  private static final int LAYOUT_STICKERPACKSLISTITEM = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hardik.stikerdemo.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hardik.stikerdemo.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hardik.stikerdemo.R.layout.fragment_search_sticker_pack, LAYOUT_FRAGMENTSEARCHSTICKERPACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hardik.stikerdemo.R.layout.fragment_sticker_pack_details, LAYOUT_FRAGMENTSTICKERPACKDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hardik.stikerdemo.R.layout.fragment_sticker_pack_list, LAYOUT_FRAGMENTSTICKERPACKLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hardik.stikerdemo.R.layout.recycler_view_item, LAYOUT_RECYCLERVIEWITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hardik.stikerdemo.R.layout.recycler_view_sub_item, LAYOUT_RECYCLERVIEWSUBITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hardik.stikerdemo.R.layout.sticker_packs_list_item, LAYOUT_STICKERPACKSLISTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCHSTICKERPACK: {
          if ("layout/fragment_search_sticker_pack_0".equals(tag)) {
            return new FragmentSearchStickerPackBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search_sticker_pack is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTICKERPACKDETAILS: {
          if ("layout/fragment_sticker_pack_details_0".equals(tag)) {
            return new FragmentStickerPackDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sticker_pack_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTICKERPACKLIST: {
          if ("layout/fragment_sticker_pack_list_0".equals(tag)) {
            return new FragmentStickerPackListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sticker_pack_list is invalid. Received: " + tag);
        }
        case  LAYOUT_RECYCLERVIEWITEM: {
          if ("layout/recycler_view_item_0".equals(tag)) {
            return new RecyclerViewItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recycler_view_item is invalid. Received: " + tag);
        }
        case  LAYOUT_RECYCLERVIEWSUBITEM: {
          if ("layout/recycler_view_sub_item_0".equals(tag)) {
            return new RecyclerViewSubItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recycler_view_sub_item is invalid. Received: " + tag);
        }
        case  LAYOUT_STICKERPACKSLISTITEM: {
          if ("layout/sticker_packs_list_item_0".equals(tag)) {
            return new StickerPacksListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for sticker_packs_list_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "categories");
      sKeys.put(2, "clickListenerMore");
      sKeys.put(3, "clickListenerPack");
      sKeys.put(4, "stickerPack");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_main_0", com.hardik.stikerdemo.R.layout.activity_main);
      sKeys.put("layout/fragment_home_0", com.hardik.stikerdemo.R.layout.fragment_home);
      sKeys.put("layout/fragment_search_sticker_pack_0", com.hardik.stikerdemo.R.layout.fragment_search_sticker_pack);
      sKeys.put("layout/fragment_sticker_pack_details_0", com.hardik.stikerdemo.R.layout.fragment_sticker_pack_details);
      sKeys.put("layout/fragment_sticker_pack_list_0", com.hardik.stikerdemo.R.layout.fragment_sticker_pack_list);
      sKeys.put("layout/recycler_view_item_0", com.hardik.stikerdemo.R.layout.recycler_view_item);
      sKeys.put("layout/recycler_view_sub_item_0", com.hardik.stikerdemo.R.layout.recycler_view_sub_item);
      sKeys.put("layout/sticker_packs_list_item_0", com.hardik.stikerdemo.R.layout.sticker_packs_list_item);
    }
  }
}
